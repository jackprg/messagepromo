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

import br.edu.infnet.messagepromodomain.WhatsApp;
import br.edu.infnet.messagepromomensagem.model.service.WhatsAppService;

@RestController
@RequestMapping("/api/whatsapp")
public class WhatsAppController {

	@Autowired
	private WhatsAppService whatsAppService;

	@PostMapping(value = "/incluir")
	public WhatsApp incluir(@RequestBody WhatsApp whatsApp) {
		return whatsAppService.incluir(whatsApp);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		whatsAppService.excluir(id);
	}

	@GetMapping(value = "/listar")
	public List<WhatsApp> obterLista() {
		return whatsAppService.obterLista();
	}
	
	@GetMapping(value = "/listarusuario/{usuarioid}")
	public List<WhatsApp> obterLista(@PathVariable Integer usuarioid) {
		return whatsAppService.obterLista(usuarioid);
	}	
		
	@GetMapping(value = "/obterporidentificador/{identificador}")
	public WhatsApp obterPorIdentificador(@PathVariable String identificador) {
		return this.whatsAppService.obterPorIdentificador(identificador);
	}

}
