package com.bruno.festa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConvidadosController {
	//método que receberá a requisição e retornará o nome da view
	@GetMapping("/convidados")
	public String listar() {
		return "ListaConvidados";
	}
}
