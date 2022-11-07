package br.edu.infnet.messagepromo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromo.model.domain.Email;
import br.edu.infnet.messagepromo.model.repository.EmailRepository;

@Service
public class EmailService {
	
	@Autowired
	private EmailRepository emailRepository;

	public void incluir(Email email) {
		emailRepository.save(email);		
	}
	
	public void excluir(Integer id) {
		emailRepository.deleteById(id);
	}
	
	public Collection<Email> obterLista(){
		return (Collection<Email>) emailRepository.findAll();
	}	
}
