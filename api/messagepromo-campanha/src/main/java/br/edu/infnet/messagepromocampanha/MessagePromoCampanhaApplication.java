package br.edu.infnet.messagepromocampanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("br.edu.infnet.messagepromodomain")
public class MessagePromoCampanhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagePromoCampanhaApplication.class, args);
	}

}
