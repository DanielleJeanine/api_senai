package com.api_senai.api;

import com.api_senai.api.entities.Endereco;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

		System.out.println("Hello World");
		Endereco end = new Endereco();
		end.setLougradoro("Rua Teresa");
		System.out.println(end);
	}





}
