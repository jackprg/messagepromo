package br.edu.infnet.messagepromo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.messagepromo.clients.ICampanhaClient;
import br.edu.infnet.messagepromo.model.data.Campanha;

@Service
public class CampanhaService {
	
	@Autowired
	private ICampanhaClient campanhaClient;

	public Campanha incluir(Campanha campanha) {
		return campanhaClient.incluir(campanha);
	}
	
	public void excluir(Integer id) {
		campanhaClient.excluir(id);
	}
	
	public Collection<Campanha> obterLista(){
		return campanhaClient.obterLista();
	}

	public Collection<Campanha> obterLista(Integer usuarioid){
		return campanhaClient.obterLista(usuarioid);
	}
	
	public Campanha save(Campanha campanha)
	{
		Campanha campanhaExists = this.campanhaClient.obterPorDescricao(campanha.getDescricao());
		
		if(campanhaExists != null)
			return campanhaExists;
		
		return this.incluir(campanha);
	}
}
