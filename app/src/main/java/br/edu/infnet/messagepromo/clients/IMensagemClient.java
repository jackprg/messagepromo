package br.edu.infnet.messagepromo.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.messagepromo.model.data.Mensagem;

@FeignClient(url = "localhost:8084/api/mensagem", name = "mensagemClient")
public interface IMensagemClient {	
	
	@GetMapping(value = "/listar")
	public List<Mensagem> obterLista();
	
	@GetMapping(value = "/listarusuario/{usuarioid}")
	public List<Mensagem> obterLista(@PathVariable Integer usuarioid);
	
	@GetMapping(value = "/obter/{id}")
	public Mensagem obter(@PathVariable Integer id);
}
