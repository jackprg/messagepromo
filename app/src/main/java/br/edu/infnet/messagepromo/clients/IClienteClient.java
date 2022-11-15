package br.edu.infnet.messagepromo.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.messagepromo.model.data.Cliente;

@FeignClient(url = "localhost:8082/api/cliente", name = "clienteClient")
public interface IClienteClient {

	@PostMapping(value = "/incluir")
	public Cliente incluir(@RequestBody Cliente cliente);

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);

	@GetMapping(value = "/listar")
	public List<Cliente> obterLista();

	@GetMapping(value = "/listarusuario/{usuarioid}")
	public List<Cliente> obterLista(@PathVariable Integer usuarioid);

	@GetMapping(value = "/obter/{id}")
	public Cliente obter(@PathVariable Integer id);
	
	@GetMapping(value = "/obterporcnpj/{cnpj}")
	public Cliente obterPorCnpj(@PathVariable String cnpj);
}
