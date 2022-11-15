package br.edu.infnet.messagepromomensagem.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromodomain.SMS;
import br.edu.infnet.messagepromomensagem.model.repository.SMSRepository;

@Service
public class SMSService {

	@Autowired
	private SMSRepository smsRepository;

	public SMS incluir(SMS sms) {
		smsRepository.save(sms);
		return sms;
	}

	public void excluir(Integer id) {
		smsRepository.deleteById(id);
	}

	public List<SMS> obterLista() {
		return (List<SMS>) smsRepository.findAll();
	}

	public List<SMS> obterLista(Integer usuarioId) {
		return (List<SMS>) smsRepository.obterLista(usuarioId);
	}

	public SMS obterPorTelefone(String telefone) {
		return this.smsRepository.findByTelefone(telefone);
	}
}
