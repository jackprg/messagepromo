package br.edu.infnet.messagepromo;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.controller.MensagemController;
import br.edu.infnet.messagepromo.model.domain.Email;
import br.edu.infnet.messagepromo.model.domain.SMS;
import br.edu.infnet.messagepromo.model.domain.WhatsApp;

@Component
public class MensagemTeste implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Email email = new Email();
		
		email.setAssunto("Lorem ipsum lobortis metus ultricies ligula placerat tellus ultricies placerat");
		email.setConteudo("Lorem ipsum lobortis metus ultricies ligula placerat tellus ultricies placerat mi eleifend, aenean quam elementum erat molestie est curae nullam blandit eu ut eros, euismod cubilia luctus ultrices vestibulum fusce nam euismod convallis habitasse. litora nisl habitant nam fusce maecenas primis eros praesent aliquet consequat pretium maecenas, risus netus platea viverra suscipit placerat aliquam odio duis donec. gravida vulputate potenti suscipit nisl tortor augue lorem blandit tortor");
		email.setCorpoEmail("");
		email.setDataEnvio(LocalDateTime.now());
		email.setEmailDestinatario("cueru@email.com");
		email.setNomeDestinatario("Cueru");
		MensagemController.incluir(email);
		
		SMS sms = new SMS();
		
		sms.setConteudo("Non blandit habitasse cursus quis tortor vitae quisque blandit molestie placerat senectus suscipit tristique");
		sms.setDataEnvio(LocalDateTime.now());
		sms.setNomeDestinatario("Buecabor");
		sms.setOperadora("VIVO");
		sms.setTelefone("90894749000");
		sms.setTexto("Enectus ante torquent ipsum in turpis laoreet cursus ut integer imperdiet. aptent sociosqu nullam augue justo nullam pretium porta feugiat primis mi imperdiet auctor");
		MensagemController.incluir(sms);
		
		WhatsApp whats = new WhatsApp();
		
		whats.setConteudo("Volutpat proin non gravida non auctor lorem tortor aptent, cubilia gravida hac ut quam eu ultrices ultricies");
		whats.setDataEnvio(LocalDateTime.now());
		whats.setIdentificador("188529");
		whats.setNomeDestinatario("Poazcu");
		whats.setTexto("Adipiscing dictumst nisl sit ultricies auctor velit. curae senectus malesuada amet aliquet a nunc");
		MensagemController.incluir(whats);

	}

}
