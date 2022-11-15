package br.edu.infnet.messagepromocliente.model.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.messagepromodomain.Cliente;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	
	@Query("from Cliente c where c.usuario.id = :usuarioid")
	List<Cliente> obterLista(Integer usuarioid);
	
	Cliente findByCnpj(String cnpj);
}