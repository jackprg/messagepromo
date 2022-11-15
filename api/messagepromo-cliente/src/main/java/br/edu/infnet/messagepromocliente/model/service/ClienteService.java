package br.edu.infnet.messagepromocliente.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromocliente.model.repository.ClienteRepository;
import br.edu.infnet.messagepromodomain.Cliente;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente incluir(Cliente cliente) {
		clienteRepository.save(cliente);
		return cliente;
	}

	public void excluir(Integer id) {
		clienteRepository.deleteById(id);
	}

	public Cliente obter(Integer id) {
		return clienteRepository.findById(id).get();
	}

	public List<Cliente> obterLista() {
		return (List<Cliente>) clienteRepository.findAll();
	}

	public List<Cliente> obterLista(Integer usuarioid) {
		return clienteRepository.obterLista(usuarioid);
	}

	public Cliente obterPorCnpj(String cnpj) {
		return this.clienteRepository.findByCnpj(cnpj);
	}

}
