package br.edu.infnet.messagepromo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromo.clients.IEnderecoClient;
import br.edu.infnet.messagepromo.clients.IUsuarioClient;
import br.edu.infnet.messagepromo.model.data.Endereco;
import br.edu.infnet.messagepromo.model.data.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private IEnderecoClient enderecoClient;
	
	@Autowired
	private IUsuarioClient usuarioClient;

	public Usuario incluir(Usuario usuario) {
		return usuarioClient.incluir(usuario);
	}
	
	public void excluir(Integer id) {
		usuarioClient.excluir(id);
	}
	
	public Collection<Usuario> obterLista(){
		return usuarioClient.obterLista();
	}
	
	public Usuario validar(String email, String senha) {

		return usuarioClient.validar(email, senha);
	}
	
	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}
	
	public Usuario save(Usuario usuario)
	{
		Usuario usuarioExists = this.usuarioClient.obterPorEmail(usuario.getEmail());
		
		if(usuarioExists != null)
			return usuarioExists;
		
		return this.incluir(usuario);
	}
}