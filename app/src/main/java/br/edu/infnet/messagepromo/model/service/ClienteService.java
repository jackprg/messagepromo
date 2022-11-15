package br.edu.infnet.messagepromo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromo.clients.IClienteClient;
import br.edu.infnet.messagepromo.model.data.Cliente;

@Service
public class ClienteService {
	
	@Autowired
	private IClienteClient clienteClient;

	public Cliente incluir(Cliente Cliente) {
		return clienteClient.incluir(Cliente);
	}
	
	public void excluir(Integer id) {
		clienteClient.excluir(id);
	}
	
	public Collection<Cliente> obterLista(){
		return clienteClient.obterLista();
	}
	
	public Collection<Cliente> obterLista(Integer usuarioid){
		return clienteClient.obterLista(usuarioid);
	}

	public Cliente obter(Integer id){
		return clienteClient.obter(id);
	}
	
	public Cliente save(Cliente cliente)
	{
		Cliente clienteExists = this.clienteClient.obterPorCnpj(cliente.getCnpj());
		
		if(clienteExists != null)
			return clienteExists;
		
		return this.incluir(cliente);
	}
}
