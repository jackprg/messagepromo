package br.edu.infnet.messagepromocampanha.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.messagepromocampanha.model.service.CampanhaService;
import br.edu.infnet.messagepromodomain.Campanha;

@RestController
@RequestMapping("/api/campanha")
public class CampanhaController {
	
	@Autowired
	private CampanhaService campanhaService;

	@PostMapping(value = "/incluir")
	public Campanha incluir(@RequestBody Campanha campanha) {
		return campanhaService.incluir(campanha);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		campanhaService.excluir(id);
	}

	@GetMapping(value = "/listar")
	public List<Campanha> obterLista() {
		return campanhaService.obterLista();
	}

	@GetMapping(value = "/listarusuario/{usuarioid}")
	public List<Campanha> obterLista(@PathVariable Integer usuarioid) {
		return campanhaService.obterLista(usuarioid);
	}

	@GetMapping(value = "/obterpordescricao/{descricao}")
	public Campanha obterPorDescricao(@PathVariable String descricao) {
		return campanhaService.obterPorDescricao(descricao);
	}
}
