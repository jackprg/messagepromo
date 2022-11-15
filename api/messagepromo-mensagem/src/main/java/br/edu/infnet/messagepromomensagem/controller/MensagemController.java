package br.edu.infnet.messagepromomensagem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.messagepromodomain.Mensagem;
import br.edu.infnet.messagepromomensagem.model.service.MensagemService;

@RestController
@RequestMapping("/api/mensagem")
public class MensagemController {

	@Autowired
	private MensagemService mensagemService;

	@GetMapping(value = "/listar")
	public List<Mensagem> obterLista() {
		return mensagemService.obterLista();
	}
	
	@GetMapping(value = "/listarusuario/{usuarioid}")
	public List<Mensagem> obterLista(@PathVariable Integer usuarioid) {
		return mensagemService.obterLista(usuarioid);
	}

	@GetMapping(value = "/obter/{id}")
	public Mensagem obter(@PathVariable Integer id) {
		return mensagemService.obter(id);
	}	
}
