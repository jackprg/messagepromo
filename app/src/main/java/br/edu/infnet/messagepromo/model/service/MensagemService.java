package br.edu.infnet.messagepromo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromo.clients.IMensagemClient;
import br.edu.infnet.messagepromo.model.data.Mensagem;

@Service
public class MensagemService {
	
	@Autowired
	private IMensagemClient mensagemClient;
	
	public Collection<Mensagem> obterLista(){
		return mensagemClient.obterLista();
	}
	
	public Collection<Mensagem> obterLista(Integer usuarioid){
		return mensagemClient.obterLista(usuarioid);
	}

	public Mensagem obter(Integer id){
		return mensagemClient.obter(id);
	}

}
