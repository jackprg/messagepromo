package br.edu.infnet.messagepromo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromo.clients.IWhatsAppClient;
import br.edu.infnet.messagepromo.model.data.WhatsApp;

@Service
public class WhatsAppService {

	@Autowired
	private IWhatsAppClient whatsAppClient;

	public WhatsApp incluir(WhatsApp WhatsApp) {
		return whatsAppClient.incluir(WhatsApp);
	}

	public void excluir(Integer id) {
		whatsAppClient.excluir(id);
	}

	public Collection<WhatsApp> obterLista() {
		return whatsAppClient.obterLista();
	}

	public Collection<WhatsApp> obterLista(Integer usuarioId) {
		return whatsAppClient.obterLista(usuarioId);
	}

	public WhatsApp save(WhatsApp whatsApp) {
		WhatsApp whatsAppExists = this.whatsAppClient.obterPorIdentificador(whatsApp.getIdentificador());

		if (whatsAppExists != null)
			return whatsAppExists;

		return this.incluir(whatsApp);
	}
}
