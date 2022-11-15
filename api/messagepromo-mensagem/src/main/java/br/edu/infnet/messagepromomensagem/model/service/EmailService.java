package br.edu.infnet.messagepromomensagem.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromodomain.Email;
import br.edu.infnet.messagepromomensagem.model.repository.EmailRepository;

@Service
public class EmailService {

	@Autowired
	private EmailRepository emailRepository;

	public Email incluir(Email email) {
		emailRepository.save(email);
		return email;
	}

	public void excluir(Integer id) {
		emailRepository.deleteById(id);
	}

	public List<Email> obterLista() {
		return (List<Email>) emailRepository.findAll();
	}

	public List<Email> obterLista(Integer usuarioId) {
		return (List<Email>) emailRepository.obterLista(usuarioId);
	}

	public Email obterPorEmailDestinatario(String emailDestinatario) {
		return this.emailRepository.findByEmailDestinatario(emailDestinatario);
	}
}
