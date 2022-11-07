package br.edu.infnet.messagepromo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infnet.messagepromo.model.domain.SMS;
import br.edu.infnet.messagepromo.model.service.SMSService;

@Controller
public class SMSController {
	

	@Autowired
	private SMSService smsService;
	
	@GetMapping(value = "/sms/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", smsService.obterLista());

		return "sms/lista";
	}
	
	@GetMapping(value = "/sms")
	public String telaCadastro() {
		return "sms/cadastro";
	}

	@PostMapping(value = "/sms/incluir")
	public String incluir(SMS sms) {
				
		smsService.incluir(sms);
		
		return "redirect:/sms/lista";
	}
	
	@GetMapping(value = "/sms/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		smsService.excluir(id);
		
		return "redirect:/sms/lista";
	}
}
