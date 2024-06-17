package br.com.herick.bluefood.infrastructure.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.herick.bluefood.application.ClienteService;
import br.com.herick.bluefood.domain.cliente.Cliente;

@Controller
@RequestMapping(path = "/public")
public class PublicController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/cliente/new")
	public String newCliente(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		return "cliente-cadastro";

	}

	@PostMapping("/cliente/save")
	public String saveCliente(@ModelAttribute("cliente") Cliente cliente) {
		clienteService.saveCliente(cliente);
		return "cliente-cadastro";

	}
}