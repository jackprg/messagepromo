package br.edu.infnet.messagepromo.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.messagepromo.model.data.Campanha;

@FeignClient(url = "localhost:8081/api/campanha", name = "campanhaClient")
public interface ICampanhaClient {

	@PostMapping(value = "/incluir")
	public Campanha incluir(@RequestBody Campanha campanha);
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/listar")
	public List<Campanha> obterLista();
	
	@GetMapping(value = "/listarusuario/{usuarioid}")
	public List<Campanha> obterLista(@PathVariable Integer usuarioid);	
	
	@GetMapping(value = "/obterpordescricao/{descricao}")
	public Campanha obterPorDescricao(@PathVariable String descricao);
}
