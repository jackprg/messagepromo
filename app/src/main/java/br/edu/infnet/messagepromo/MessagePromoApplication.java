package br.edu.infnet.messagepromo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EntityScan("br.edu.infnet.messagepromodomain")
@EnableFeignClients
public class MessagePromoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagePromoApplication.class, args);
	}

}
