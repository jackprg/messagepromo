package br.edu.infnet.messagepromo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.messagepromo.model.data.SMS;
import br.edu.infnet.messagepromo.model.data.Usuario;
import br.edu.infnet.messagepromo.model.service.SMSService;

@Controller
public class SMSController {
	

	@Autowired
	private SMSService smsService;
	
	@GetMapping(value = "/sms/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", smsService.obterLista(usuario.getId()));

		return "sms/lista";
	}
	
	@GetMapping(value = "/sms")
	public String telaCadastro() {
		return "sms/cadastro";
	}

	@PostMapping(value = "/sms/incluir")
	public String incluir(SMS sms, @SessionAttribute("user") Usuario usuario) {
		
		sms.setUsuario(usuario);
		
		smsService.incluir(sms);
		
		return "redirect:/sms/lista";
	}
	
	@GetMapping(value = "/sms/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		smsService.excluir(id);
		
		return "redirect:/sms/lista";
	}
}
