package br.com.aula.aulademo.service;

import br.com.aula.aulademo.model.Contato;
import br.com.aula.aulademo.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public List<Contato> findAll(){
        return contatoRepository.findAll();
    }

    public Contato findById(Long id) {
        return contatoRepository.getById(id);
    }
}
