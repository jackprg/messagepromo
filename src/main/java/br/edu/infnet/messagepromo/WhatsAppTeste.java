package br.edu.infnet.messagepromo;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.controller.WhatsAppController;
import br.edu.infnet.messagepromo.model.domain.WhatsApp;

@Component
public class WhatsAppTeste implements ApplicationRunner  {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		WhatsApp whats = new WhatsApp();
		
		whats.setConteudo("Volutpat proin non gravida non auctor lorem tortor aptent, cubilia gravida hac ut quam eu ultrices ultricies");
		whats.setDataEnvio(LocalDateTime.now());
		whats.setIdentificador("188529");
		whats.setNomeDestinatario("Poazcu");
		whats.setTexto("Adipiscing dictumst nisl sit ultricies auctor velit. curae senectus malesuada amet aliquet a nunc");		
		
		WhatsAppController.incluir(whats);

		whats = new WhatsApp();
		
		whats.setConteudo("Conubia at litora gravida pretium enim nec arcu, orci leo aptent cursus metus consequat volutpat");
		whats.setDataEnvio(LocalDateTime.now());
		whats.setIdentificador("428158");
		whats.setNomeDestinatario("Doazu");
		whats.setTexto("Placerat curae quis adipiscing aptent aenean. cras vel bibendum curabitur euismod hendrerit");		
		
		WhatsAppController.incluir(whats);

		whats = new WhatsApp();
		
		whats.setConteudo("Egestas fames tempus enim proin rhoncus euismod sem litora sem vel, mollis nunc integer ut vehicula taciti cras vivamus");
		whats.setDataEnvio(LocalDateTime.now());
		whats.setIdentificador("432101");
		whats.setNomeDestinatario("Unwul");
		whats.setTexto("Leo suspendisse vitae vel justo quisque morbi laoreet massa fusce id");		
		
		WhatsAppController.incluir(whats);

	}


}
