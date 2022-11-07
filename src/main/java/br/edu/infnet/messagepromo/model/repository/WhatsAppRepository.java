package br.edu.infnet.messagepromo.model.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.messagepromo.model.domain.WhatsApp;

@Repository
public interface WhatsAppRepository extends CrudRepository<WhatsApp, Integer> {

}