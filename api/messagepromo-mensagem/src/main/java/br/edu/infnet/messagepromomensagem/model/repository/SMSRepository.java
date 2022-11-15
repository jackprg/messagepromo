package br.edu.infnet.messagepromomensagem.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.messagepromodomain.SMS;

@Repository
public interface SMSRepository extends CrudRepository<SMS, Integer> {
	
	@Query("from SMS s where s.usuario.id = :usuarioid")
	List<SMS> obterLista(Integer usuarioid);

	
	SMS findByTelefone(String telefone);
}