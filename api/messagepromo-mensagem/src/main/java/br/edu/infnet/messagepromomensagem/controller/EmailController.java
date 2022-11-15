package br.edu.infnet.messagepromomensagem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.messagepromodomain.Email;
import br.edu.infnet.messagepromomensagem.model.service.EmailService;

@RestController
@RequestMapping("/api/email")
public class EmailController {

	@Autowired
	private EmailService emailService;

	@PostMapping(value = "/incluir")
	public Email incluir(@RequestBody Email email) {
		return emailService.incluir(email);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		emailService.excluir(id);
	}

	@GetMapping(value = "/listar")
	public List<Email> obterLista() {
		return emailService.obterLista();
	}
	
	@GetMapping(value = "/listarusuario/{usuarioid}")
	public List<Email> obterLista(@PathVariable Integer usuarioid) {
		return emailService.obterLista(usuarioid);
	}	

	@GetMapping(value = "/obterporemaileestinatario/{emailDestinatario}")
	public Email obterPorEmailDestinatario(@PathVariable String emailDestinatario) {
		return this.emailService.obterPorEmailDestinatario(emailDestinatario);
	}

}