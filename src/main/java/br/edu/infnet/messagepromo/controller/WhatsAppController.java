package br.edu.infnet.messagepromo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infnet.messagepromo.model.domain.WhatsApp;
import br.edu.infnet.messagepromo.model.service.WhatsAppService;

@Controller
public class WhatsAppController {


	@Autowired
	private WhatsAppService whatsAppService;
	
	@GetMapping(value = "/whatsapp/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", whatsAppService.obterLista());

		return "whatsapp/lista";
	}
	
	@GetMapping(value = "/whatsapp")
	public String telaCadastro() {
		return "whatsapp/cadastro";
	}

	@PostMapping(value = "/whatsapp/incluir")
	public String incluir(WhatsApp whatsApp) {
				
		whatsAppService.incluir(whatsApp);
		
		return "redirect:/whatsapp/lista";
	}
	
	@GetMapping(value = "/whatsapp/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		whatsAppService.excluir(id);
		
		return "redirect:/whatsapp/lista";
	}
}
