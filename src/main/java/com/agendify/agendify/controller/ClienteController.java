package com.agendify.agendify.controller;

import com.agendify.agendify.domain.Cliente;
import com.agendify.agendify.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController // Anotação que diz ao Spring que esta classe é um Controller REST.
@RequestMapping("/clientes") // Define que todos os endpoints nesta classe começarão com /clientes.

public class ClienteController {
    @Autowired // Pede ao Spring pra injetar uma instância do ClienteRepository.
    private ClienteRepository clienteRepository;

    @PostMapping // Mapeia este método para o verbo HTTP POST.
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        // O @ResquestBody converte o JSON do corpo do corpo da requisição para um objeto Cliente.
        return clienteRepository.save(cliente);
    }
    
    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }
    
    
}
