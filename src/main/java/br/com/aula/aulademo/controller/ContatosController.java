package br.com.aula.aulademo.controller;

import br.com.aula.aulademo.model.Contato;
import br.com.aula.aulademo.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("contato")
public class ContatosController {

    // CDI - INJECAO DE DEPENDENCIA - INSTANCIA A CLASSE ABAIXO PARA USO DESTA CLASSE CONTROLLER
    @Autowired
    private ContatoService contatoService;

    @GetMapping
    public List<Contato> findAll(){
        return contatoService.findAll();
    }

    @GetMapping("/{id}")
    public Contato findById(@PathVariable("id") Long id){
        return contatoService.findById(id);
    }

    @PostMapping
    public String save(@RequestBody String corpo){
        return null;
    }

    @PutMapping
    public String update(@RequestBody String corpo){
        return null;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id){
        return null;
    }
}
