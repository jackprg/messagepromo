package br.edu.infnet.messagepromocampanha.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.messagepromodomain.Campanha;

@Repository
public interface CampanhaRepository extends CrudRepository<Campanha, Integer> {

	@Query("from Campanha c where c.usuario.id = :usuarioid")
	List<Campanha> obterLista(Integer usuarioid);

	Campanha findByDescricao(String descricao);
}
