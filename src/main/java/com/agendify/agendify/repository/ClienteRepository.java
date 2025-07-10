package com.agendify.agendify.repository;

import com.agendify.agendify.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    boolean existByTelefone(String telefone);
}
