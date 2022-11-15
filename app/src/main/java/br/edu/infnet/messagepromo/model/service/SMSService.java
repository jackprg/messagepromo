package br.edu.infnet.messagepromo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromo.clients.ISMSClient;
import br.edu.infnet.messagepromo.model.data.SMS;

@Service
public class SMSService {
	
	@Autowired
	private ISMSClient smsClient;

	public SMS incluir(SMS SMS) {
		return smsClient.incluir(SMS);
	}
	
	public void excluir(Integer id) {
		smsClient.excluir(id);
	}
	
	public Collection<SMS> obterLista(){
		return smsClient.obterLista();
	}

	public Collection<SMS> obterLista(Integer usuarioId){
		return smsClient.obterLista(usuarioId);
	}

	public SMS save(SMS sms)
	{
		SMS smsExists = this.smsClient.obterPorTelefone(sms.getTelefone());
		
		if(smsExists != null)
			return smsExists;
		
		return this.incluir(sms);
	}
}
