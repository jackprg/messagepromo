package br.edu.infnet.messagepromo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromo.clients.IEmailClient;
import br.edu.infnet.messagepromo.model.data.Email;

@Service
public class EmailService {
	
	@Autowired
	private IEmailClient emailClient;

	public Email incluir(Email Email) {
		return emailClient.incluir(Email);
	}
	
	public void excluir(Integer id) {
		emailClient.excluir(id);
	}
	
	public Collection<Email> obterLista(){
		return emailClient.obterLista();
	}

	public Collection<Email> obterLista(Integer usuarioId){
		return emailClient.obterLista(usuarioId);
	}

	public Email save(Email email)
	{
		Email emailExists = this.emailClient.obterPorEmailDestinatario(email.getEmailDestinatario());
		
		if(emailExists != null)
			return emailExists;
		
		return this.incluir(email);
	}
}
