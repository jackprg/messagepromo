package br.edu.infnet.messagepromo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.messagepromo.model.data.Email;
import br.edu.infnet.messagepromo.model.data.Usuario;
import br.edu.infnet.messagepromo.model.service.EmailService;

@Controller
public class EmailController {

	@Autowired
	private EmailService emailService;

	@GetMapping(value = "/email/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", emailService.obterLista(usuario.getId()));

		return "email/lista";
	}

	@GetMapping(value = "/email")
	public String telaCadastro() {
		return "email/cadastro";
	}

	@PostMapping(value = "/email/incluir")
	public String incluir(Email email, @SessionAttribute("user") Usuario usuario) {

		email.setUsuario(usuario);

		emailService.incluir(email);

		return "redirect:/email/lista";
	}

	@GetMapping(value = "/email/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		emailService.excluir(id);

		return "redirect:/email/lista";
	}
}