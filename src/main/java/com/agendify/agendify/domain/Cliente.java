package com.agendify.agendify.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "clientes") // Define o nome da tabela no BD.
@Entity(name = "Cliente") // Define que esta classe é uma entidade JPA.
@Getter // Lombok: Gera os métodos getters.
@NoArgsConstructor // Lombok: Gera um construtor sem argumentos.
@AllArgsConstructor // Lombok: Gera um construtor com todos argumentos.
@EqualsAndHashCode(of = "id") // Lombok: Cria equals e hashCode baeados no ID.

public class Cliente {

    @Id // Chave primária da tabela.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O BD gerencia a geração do ID.
    private Long id;
    private String nome;
    private String telefone;
}