package br.edu.infnet.messagepromomensagem.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromodomain.WhatsApp;
import br.edu.infnet.messagepromomensagem.model.repository.WhatsAppRepository;

@Service
public class WhatsAppService {

	@Autowired
	private WhatsAppRepository whatsAppRepository;

	public WhatsApp incluir(WhatsApp whatsApp) {
		whatsAppRepository.save(whatsApp);
		return whatsApp;
	}

	public void excluir(Integer id) {
		whatsAppRepository.deleteById(id);
	}

	public List<WhatsApp> obterLista() {
		return (List<WhatsApp>) whatsAppRepository.findAll();
	}

	public List<WhatsApp> obterLista(Integer usuarioId) {
		return (List<WhatsApp>) whatsAppRepository.obterLista(usuarioId);
	}

	public WhatsApp obterPorIdentificador(String identificador) {
		return this.whatsAppRepository.findByIdentificador(identificador);
	}
}
