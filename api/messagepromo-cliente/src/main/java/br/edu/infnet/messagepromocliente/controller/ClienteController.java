package br.edu.infnet.messagepromocliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.messagepromocliente.model.service.ClienteService;
import br.edu.infnet.messagepromodomain.Cliente;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping(value = "/incluir")
	public Cliente incluir(@RequestBody Cliente cliente) {
		return clienteService.incluir(cliente);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		clienteService.excluir(id);
	}

	@GetMapping(value = "/listar")
	public List<Cliente> obterLista() {
		return clienteService.obterLista();
	}

	@GetMapping(value = "/listarusuario/{usuarioid}")
	public List<Cliente> obterLista(@PathVariable Integer usuarioid) {
		return clienteService.obterLista(usuarioid);
	}

	@GetMapping(value = "/obter/{id}")
	public Cliente obter(@PathVariable Integer id) {
		return clienteService.obter(id);
	}
	
	@GetMapping(value = "/obterporcnpj/{cnpj}")
	public Cliente obterPorCnpj(@PathVariable String cnpj) {
		return clienteService.obterPorCnpj(cnpj);
	}
}