package br.edu.infnet.messagepromousuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.messagepromousuario.model.service.UsuarioService;
import br.edu.infnet.messagepromodomain.Usuario;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@PostMapping(value = "/incluir")
	public Usuario incluir(@RequestBody Usuario usuario) {
		return usuarioService.incluir(usuario);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		usuarioService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public List<Usuario> obterLista(){
		return usuarioService.obterLista();
	}

	@GetMapping(value = "/obterporemail/{email}")
	public Usuario obterPorEmail(@PathVariable String email){
		return usuarioService.obterPorEmail(email);
	}

	@PostMapping(value = "/validar")
	public Usuario validar(@RequestParam String email, @RequestParam String senha) {
		return usuarioService.validar(email, senha);
	}
}