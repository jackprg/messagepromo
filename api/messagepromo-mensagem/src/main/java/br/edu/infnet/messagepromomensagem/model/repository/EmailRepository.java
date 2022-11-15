package br.edu.infnet.messagepromomensagem.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.messagepromodomain.Email;

@Repository
public interface EmailRepository extends CrudRepository<Email, Integer> {
	
	@Query("from Email e where e.usuario.id = :usuarioid")
	List<Email> obterLista(Integer usuarioid);

	Email findByEmailDestinatario(String emailDestinatario);
	
}