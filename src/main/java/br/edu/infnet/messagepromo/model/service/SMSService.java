package br.edu.infnet.messagepromo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromo.model.domain.SMS;
import br.edu.infnet.messagepromo.model.repository.SMSRepository;

@Service
public class SMSService {
	
	@Autowired
	private SMSRepository smsRepository;

	public void incluir(SMS sms) {
		smsRepository.save(sms);		
	}
	
	public void excluir(Integer id) {
		smsRepository.deleteById(id);
	}
	
	public Collection<SMS> obterLista(){
		return (Collection<SMS>) smsRepository.findAll();
	}	
}
