package com.agendify.agendify.service;

import com.agendify.agendify.domain.Cliente;
import com.agendify.agendify.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Anotação que define esta classe como um componente de serviço
public class ClienteService {
    @Autowired // O service agora depende do repository
    private ClienteRepository clienteRepository;

    public Cliente cadastrar(Cliente cliente) {
        // Regras de negócio
        boolean telefoneJaCadastrado = clienteRepository.existsByTelefone(cliente.getTelefone());

        if (telefoneJaCadastrado){
            // exceção se o telefone já existir
            throw new IllegalArgumentException("Telefone já cadastrado no sistema.");
        }
        return clienteRepository.save(cliente);
    }
    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }
    
}