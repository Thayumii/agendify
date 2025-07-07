package com.agendify.agendify.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/hello")
    public String hello() {
        return "Olá, mundo! Meu sistema de agendamento está no ar!";
    }
}