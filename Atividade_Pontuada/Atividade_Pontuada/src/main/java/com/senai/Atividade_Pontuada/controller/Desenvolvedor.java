package com.senai.Atividade_Pontuada.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/desenvolvedor")
public class Desenvolvedor {
    @GetMapping
    public String exibirMensagem() {
        return "Desenvolvedor: Júlio César";
    }
}
