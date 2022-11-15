package br.edu.infnet.messagepromomensagem.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.messagepromodomain.Mensagem;

@Repository
public interface MensagemRepository extends CrudRepository<Mensagem, Integer> {

	@Query("from Mensagem m where m.usuario.id = :usuarioid")
	List<Mensagem> obterLista(Integer usuarioid);
}
