package br.edu.infnet.messagepromo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromo.model.domain.WhatsApp;
import br.edu.infnet.messagepromo.model.repository.WhatsAppRepository;

@Service
public class WhatsAppService {
	
	@Autowired
	private WhatsAppRepository whatsAppRepository;

	public void incluir(WhatsApp whatsApp) {
		whatsAppRepository.save(whatsApp);		
	}
	
	public void excluir(Integer id) {
		whatsAppRepository.deleteById(id);
	}
	
	public Collection<WhatsApp> obterLista(){
		return (Collection<WhatsApp>) whatsAppRepository.findAll();
	}	
}
