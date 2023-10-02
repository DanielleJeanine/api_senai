package com.api_senai.api.entities;

import lombok.Data;

@Data
public class Endereco {
    private String cep;
    private String lougradoro;
    private String numero;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public Endereco getEnderecoByCep(String cep){
        Endereco endereco = new Endereco();

        //Mandar o cep para o viaCep
        HttpGet request = new HttpGet

        return endereco;
    }
}
