package br.edu.infnet.messagepromousuario.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromousuario.model.repository.UsuarioRepository;
import br.edu.infnet.messagepromodomain.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
		return usuario;
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}

	public List<Usuario> obterLista() {
		return (List<Usuario>) usuarioRepository.findAll();
	}

	public Usuario obterPorEmail(String email) {
		return this.usuarioRepository.findByEmail(email);
	}

	public Usuario validar(String email, String senha) {

		email = (email != null ? email : "").trim().toUpperCase();

		if (email == "")
			return null;

		Usuario usuario = usuarioRepository.findByEmail(email);

		if (usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		}

		return null;
	}
}