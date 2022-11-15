package br.edu.infnet.messagepromo.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.messagepromo.model.data.Email;

@FeignClient(url = "localhost:8084/api/email", name = "emailClient")
public interface IEmailClient {

	@PostMapping(value = "/incluir")
	public Email incluir(@RequestBody Email email);
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/listar")
	public List<Email> obterLista();
	
	@GetMapping(value = "/obterporemaileestinatario/{emailDestinatario}")
	public Email obterPorEmailDestinatario(@PathVariable String emailDestinatario);
	
	@GetMapping(value = "/listarusuario/{usuarioid}")
	public List<Email> obterLista(@PathVariable Integer usuarioid);
}
