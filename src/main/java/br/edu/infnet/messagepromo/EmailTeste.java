package br.edu.infnet.messagepromo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.model.domain.Email;
import br.edu.infnet.messagepromo.model.service.EmailService;

@Order(5)
@Component
public class EmailTeste implements ApplicationRunner  {

	@Autowired
	private EmailService emailService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Email email = new Email();
		
		email.setAssunto("Lorem ipsum lobortis metus ultricies ligula placerat tellus ultricies placerat");
		email.setConteudo("Lorem ipsum lobortis metus ultricies ligula placerat tellus ultricies placerat mi eleifend");
		email.setCorpoEmail("");
		email.setDataEnvio(LocalDateTime.now());
		email.setEmailDestinatario("cueru@email.com");
		email.setNomeDestinatario("Cueru");
		emailService.incluir(email);
		
	
		email = new Email();
		
		email.setAssunto("Egestas non eu nam ac accumsan elementum");
		email.setConteudo("Egestas non eu nam ac accumsan elementum lobortis ");
		email.setCorpoEmail("Sed blandit nulla ultrices accumsan sit rutrum vehicula");
		email.setDataEnvio(LocalDateTime.now());
		email.setEmailDestinatario("barli@email.com");
		email.setNomeDestinatario("Barli");
		emailService.incluir(email);
		
		email = new Email();
		
		email.setAssunto("Sed eros molestie aenean rhoncus curabitur ultricies");
		email.setConteudo("Sed eros molestie aenean rhoncus curabitur ultricies interdum ");
		email.setCorpoEmail("elementum cubilia sodales posuere tempor malesuada");
		email.setDataEnvio(LocalDateTime.now());
		email.setEmailDestinatario("toias@email.com");
		email.setNomeDestinatario("Toias");
		emailService.incluir(email);

	}

	
}
