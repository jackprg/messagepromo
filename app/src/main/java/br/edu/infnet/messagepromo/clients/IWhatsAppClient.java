package br.edu.infnet.messagepromo.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.messagepromo.model.data.WhatsApp;

@FeignClient(url = "localhost:8084/api/whatsapp", name = "whatsappClient")
public interface IWhatsAppClient {

	@PostMapping(value = "/incluir")
	public WhatsApp incluir(@RequestBody WhatsApp whatsApp);

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);

	@GetMapping(value = "/listar")
	public List<WhatsApp> obterLista();

	@GetMapping(value = "/obterporidentificador/{identificador}")
	public WhatsApp obterPorIdentificador(@PathVariable String identificador);

	@GetMapping(value = "/listarusuario/{usuarioid}")
	public List<WhatsApp> obterLista(@PathVariable Integer usuarioid);
}
