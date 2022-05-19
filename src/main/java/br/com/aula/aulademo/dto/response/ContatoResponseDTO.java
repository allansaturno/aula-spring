package br.com.aula.aulademo.dto.response;

import br.com.aula.aulademo.model.Contato;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data
@Builder
public class ContatoResponseDTO {
    private Long idContato;
    private String nome;
    private String telefone;
    private String email;
    private LocalDateTime dtCriacao;
    private LocalDateTime dtAtualizacao;
    private Boolean status;
    private String tipo;

    public static ContatoResponseDTO fromEntity(Contato contato){
        return ContatoResponseDTO.builder()
                .idContato(contato.getIdContato())
                .dtAtualizacao(contato.getDtAtualizacao())
                .dtCriacao(contato.getDtCriacao())
                .nome(contato.getNome())
                .email(contato.getEmail())
                .telefone(contato.getTelefone())
                .status(contato.getStatus())
                .tipo("RESPONSE DTO")
                .build();
    }
}
