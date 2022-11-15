package br.edu.infnet.messagepromo.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.messagepromo.model.data.Usuario;

@FeignClient(url = "localhost:8086/api/usuario", name = "usuarioClient")
public interface IUsuarioClient {

	@PostMapping(value = "/incluir")
	public Usuario incluir(@RequestBody Usuario usuario);
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/listar")
	public List<Usuario> obterLista();
	
	@GetMapping(value = "/obterporemail/{email}")
	public Usuario obterPorEmail(@PathVariable String email);

	@PostMapping(value = "/validar")
	public Usuario validar(@RequestParam String email, @RequestParam String senha);
}