package br.com.aula.aulademo.service;

import br.com.aula.aulademo.dto.request.ContatoRequestDTO;
import br.com.aula.aulademo.dto.response.ContatoResponseDTO;
import br.com.aula.aulademo.model.Contato;
import br.com.aula.aulademo.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public List<ContatoResponseDTO> findAll() {
        return contatoRepository.findAll()
                .stream()
                .map(ContatoResponseDTO::fromEntity)
                .collect(Collectors.toList());
    }

    public Contato findById(Long id) {
        return contatoRepository.findById(id).orElse(null);
    }

    public ContatoResponseDTO save(ContatoRequestDTO contatoRequestDTO) {
        Contato contato = this.fromDTO(contatoRequestDTO);
        return ContatoResponseDTO.fromEntity(contatoRepository.save(contato));
    }

    private Contato fromDTO(ContatoRequestDTO contatoRequestDTO) {
        Contato contato = Contato.builder()
                .idContato(contatoRequestDTO.getId())
                .email(contatoRequestDTO.getEmailContato())
                .nome(contatoRequestDTO.getNomeContato())
                .telefone(contatoRequestDTO.getTelefoneContato())
                .dtAtualizacao(LocalDateTime.now())
                .status(Boolean.TRUE)
                .build();

        if(Objects.nonNull(contatoRequestDTO.getId())) {
            Contato exists = findById(contatoRequestDTO.getId());
            contato = contato.toBuilder()
                    .dtCriacao(Objects.isNull(exists) ? LocalDateTime.now() : exists.getDtCriacao())
                    .build();
        }else{
            contato = contato
                    .toBuilder()
                    .dtCriacao(LocalDateTime.now())
                    .build();
        }

        return contato;
    }

    public Contato update(ContatoRequestDTO contatoRequestDTO) {
        Contato contato = this.fromDTO(contatoRequestDTO);
        return contatoRepository.save(contato);
    }

    public String delete(Long id) {
        contatoRepository.deleteById(id);
        return "EXCLUIDO!";
    }
}
