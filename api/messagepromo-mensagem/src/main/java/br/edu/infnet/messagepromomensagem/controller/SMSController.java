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

import br.edu.infnet.messagepromodomain.SMS;
import br.edu.infnet.messagepromomensagem.model.service.SMSService;

@RestController
@RequestMapping("/api/sms")
public class SMSController {
	
	@Autowired
	private SMSService smsService;

	@PostMapping(value = "/incluir")
	public SMS incluir(@RequestBody SMS sms) {
		return smsService.incluir(sms);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		smsService.excluir(id);
	}

	@GetMapping(value = "/listar")
	public List<SMS> obterLista() {
		return smsService.obterLista();
	}
	
	@GetMapping(value = "/listarusuario/{usuarioid}")
	public List<SMS> obterLista(@PathVariable Integer usuarioid) {
		return smsService.obterLista(usuarioid);
	}	
	
	
	@GetMapping(value = "/obterportelefone/{telefone}")
	public SMS obterPorTelefone(@PathVariable String telefone) {
		return this.smsService.obterPorTelefone(telefone);
	}

}
