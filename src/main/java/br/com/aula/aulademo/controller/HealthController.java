package br.com.aula.aulademo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("health-check")
public class HealthController {

    @GetMapping
    public String validaHealth(){
        return "OK";
    }

    @GetMapping("/database")
    public String validaDatabase(){
        return "Database OK";
    }

}
