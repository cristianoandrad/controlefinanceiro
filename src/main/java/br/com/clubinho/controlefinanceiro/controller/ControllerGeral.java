package br.com.clubinho.controlefinanceiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerGeral {
	
	@GetMapping("/")
	public String inicial() {
		return "index.html";
	}

}
