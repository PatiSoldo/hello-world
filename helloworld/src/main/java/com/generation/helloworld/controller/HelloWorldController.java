package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("bsm")
	public String lista() {
		return"BSM’s da Generation Brasil\r\n"
				+ "				\r\n"
				+ "				Mentalidade de crescimento\r\n"
				+ "				Persistência"
				+ "             Responsabilidade\r\n"
				+ "				Orentação ao futuro\r\n"
				+ "				Orientação aos detalhes\r\n"
				+ "				Proatividade\r\n"
				+ "				Trabalho em equipe";
 }
	
	@GetMapping("Objetivos da Semana")
	public String aprendizagem(){
		return "Aplicar o aprendizado no blog pessoal"
				+ "Ler todo o conteúdo dos cookbooks"
				+ "Assistir os vídeos da plataforma"
				+ "Aplicar o aprendizado no projeto integrador"
				+ "Participar da mentoria de empregabilidade"
				+ "Participar da aula de reforço"
				+ "Fazer os feedbacks em grupo referente a semana";
	}
}