package br.edu.infnet.messagepromo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infnet.messagepromo.model.domain.Email;
import br.edu.infnet.messagepromo.model.service.EmailService;

@Controller
public class EmailController {
	
	
	@Autowired
	private EmailService emailService;
	
	@GetMapping(value = "/email/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", emailService.obterLista());

		return "email/lista";
	}
	
	@GetMapping(value = "/email")
	public String telaCadastro() {
		return "email/cadastro";
	}

	@PostMapping(value = "/email/incluir")
	public String incluir(Email email) {
				
		emailService.incluir(email);
		
		return "redirect:/email/lista";
	}
	
	@GetMapping(value = "/email/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		emailService.excluir(id);
		
		return "redirect:/email/lista";
	}
}