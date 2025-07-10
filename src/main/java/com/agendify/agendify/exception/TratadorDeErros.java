package com.agendify.agendify.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // Anotação que diz ao spring que esta classe vai tratar exceções de forma global
public class TratadorDeErros {
    // Este método será chamado sempre que uma IllegalArgumentException for lançada
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity tratarErroRegraDeNegocio(IllegalArgumentException ex) {
        // Retorna o status 400 com a mensagem da exceção
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
    
}
