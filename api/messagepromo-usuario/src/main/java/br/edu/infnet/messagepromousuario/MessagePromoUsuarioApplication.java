package br.edu.infnet.messagepromousuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("br.edu.infnet.messagepromodomain")
public class MessagePromoUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagePromoUsuarioApplication.class, args);

	}

}
