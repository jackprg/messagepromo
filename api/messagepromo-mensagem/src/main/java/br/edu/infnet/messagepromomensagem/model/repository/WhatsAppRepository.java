package br.edu.infnet.messagepromomensagem.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.messagepromodomain.WhatsApp;

@Repository
public interface WhatsAppRepository extends CrudRepository<WhatsApp, Integer> {

	@Query("from WhatsApp w where w.usuario.id = :usuarioid")
	List<WhatsApp> obterLista(Integer usuarioid);

	WhatsApp findByIdentificador(String identificador);
}