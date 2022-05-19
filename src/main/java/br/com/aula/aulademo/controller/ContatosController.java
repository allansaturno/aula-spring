package br.com.aula.aulademo.controller;

import br.com.aula.aulademo.dto.request.ContatoRequestDTO;
import br.com.aula.aulademo.dto.response.ContatoResponseDTO;
import br.com.aula.aulademo.model.Contato;
import br.com.aula.aulademo.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contato")
public class ContatosController {

    // CDI - INJECAO DE DEPENDENCIA - INSTANCIA A CLASSE ABAIXO PARA USO DESTA CLASSE CONTROLLER
    @Autowired
    private ContatoService contatoService;

    @GetMapping
    public List<ContatoResponseDTO> findAll() {
        return contatoService.findAll();
    }

    @GetMapping("/{id}")
    public Contato findById(@PathVariable("id") Long id) {
        return contatoService.findById(id);
    }

    @PostMapping
    public ContatoResponseDTO save(@RequestBody ContatoRequestDTO contatoRequestDTO) {
        return contatoService.save(contatoRequestDTO);
    }

    @PutMapping
    public Contato update(@RequestBody ContatoRequestDTO contatoRequestDTO) {
        return contatoService.update(contatoRequestDTO);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        return contatoService.delete(id);
    }

}
