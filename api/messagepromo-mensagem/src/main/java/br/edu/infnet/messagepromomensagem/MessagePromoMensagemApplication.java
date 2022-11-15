package br.edu.infnet.messagepromomensagem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("br.edu.infnet.messagepromodomain")
public class MessagePromoMensagemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagePromoMensagemApplication.class, args);
	}

}
