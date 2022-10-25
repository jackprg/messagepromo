package br.edu.infnet.messagepromo;

import java.util.Date;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.model.domain.Email;

@Component
public class EmailTeste implements ApplicationRunner  {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Email email = new Email();
		
		email.setAssunto("Lorem ipsum lobortis metus ultricies ligula placerat tellus ultricies placerat");
		email.setConteudo("Lorem ipsum lobortis metus ultricies ligula placerat tellus ultricies placerat mi eleifend, aenean quam elementum erat molestie est curae nullam blandit eu ut eros, euismod cubilia luctus ultrices vestibulum fusce nam euismod convallis habitasse. litora nisl habitant nam fusce maecenas primis eros praesent aliquet consequat pretium maecenas, risus netus platea viverra suscipit placerat aliquam odio duis donec. gravida vulputate potenti suscipit nisl tortor augue lorem blandit tortor");
		email.setCorpoEmail("");
		email.setDataEnvio(new Date());
		email.setEmailDestinatario("cueru@email.com");
		email.setId(1);
		email.setNomeDestinatario("Cueru");
		
		System.out.println(String.format("Email - %s", email.toString()));

	
		 email = new Email();
		
		email.setAssunto("Egestas non eu nam ac accumsan elementum");
		email.setConteudo("Egestas non eu nam ac accumsan elementum lobortis mollis quam, vitae interdum porttitor iaculis aenean ultricies ligula aenean urna");
		email.setCorpoEmail("Sed blandit nulla ultrices accumsan sit rutrum vehicula etiam est tristique mattis, aliquam dui augue gravida odio iaculis nulla aliquam arcu non");
		email.setDataEnvio(new Date());
		email.setEmailDestinatario("barli@email.com");
		email.setId(2);
		email.setNomeDestinatario("Barli");
		
		System.out.println(String.format("Email - %s", email.toString()));

		 email = new Email();
		
		email.setAssunto("Sed eros molestie aenean rhoncus curabitur ultricies");
		email.setConteudo("Sed eros molestie aenean rhoncus curabitur ultricies interdum quisque ultrices nisl, vehicula donec ut feugiat donec morbi class hac vivamus, amet sodales donec vehicula urna ultrices vitae neque mollis");
		email.setCorpoEmail("elementum cubilia sodales posuere tempor malesuada");
		email.setDataEnvio(new Date());
		email.setEmailDestinatario("toias@email.com");
		email.setId(3);
		email.setNomeDestinatario("Toias");
		
		System.out.println(String.format("Email - %s", email.toString()));

	}

	
}
