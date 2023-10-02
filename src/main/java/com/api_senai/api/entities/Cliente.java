package com.api_senai.api.entities;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class Cliente {
    private UUID id;
    private String nome;
    private String cpf;
    private LocalDate dataDeNascimento;
    private String endereço;
    private String telefone;
    private String email;
    private String login;
    private String senha;
}
