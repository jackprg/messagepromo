package br.edu.infnet.messagepromo.model.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.messagepromo.model.domain.Email;

@Repository
public interface EmailRepository extends CrudRepository<Email, Integer> {

}