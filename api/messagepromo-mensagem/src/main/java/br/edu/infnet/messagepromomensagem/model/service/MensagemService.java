package br.edu.infnet.messagepromomensagem.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromodomain.Mensagem;
import br.edu.infnet.messagepromomensagem.model.repository.MensagemRepository;

@Service
public class MensagemService {

	@Autowired
	private MensagemRepository mensagemRepository;

	public List<Mensagem> obterLista() {
		return (List<Mensagem>) mensagemRepository.findAll();
	}

	public List<Mensagem> obterLista(Integer usuarioid) {
		return mensagemRepository.obterLista(usuarioid);
	}

	public Mensagem obter(Integer id) {
		return mensagemRepository.findById(id).get();
	}
}
