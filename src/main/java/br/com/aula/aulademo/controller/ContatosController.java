package br.com.aula.aulademo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("contato")
public class ContatosController {

    @GetMapping
    public String findAll(){
        return null;
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id){
        return null;
    }

    @PostMapping
    public String save(@RequestBody String corpo){
        return null;
    }

    @PutMapping
    public String update(@RequestBody String corpo){
        return null;
    }
}
