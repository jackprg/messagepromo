package br.edu.infnet.messagepromo.model.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.messagepromo.model.domain.SMS;

@Repository
public interface SMSRepository extends CrudRepository<SMS, Integer> {

}