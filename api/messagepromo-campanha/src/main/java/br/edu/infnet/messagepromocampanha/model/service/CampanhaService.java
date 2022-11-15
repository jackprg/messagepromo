package br.edu.infnet.messagepromocampanha.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromocampanha.model.repository.CampanhaRepository;
import br.edu.infnet.messagepromodomain.Campanha;

@Service
public class CampanhaService {

	@Autowired
	private CampanhaRepository campanhaRepository;

	public Campanha incluir(Campanha campanha) {
		campanhaRepository.save(campanha);
		return campanha;
	}

	public void excluir(Integer id) {
		campanhaRepository.deleteById(id);
	}

	public List<Campanha> obterLista() {
		return (List<Campanha>) campanhaRepository.findAll();
	}

	public List<Campanha> obterLista(Integer usuarioid) {
		return (List<Campanha>) campanhaRepository.obterLista(usuarioid);
	}

	public Campanha obterPorDescricao(String descricao) {
		return this.campanhaRepository.findByDescricao(descricao);
	}
}
