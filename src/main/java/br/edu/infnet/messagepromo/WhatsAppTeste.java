package br.edu.infnet.messagepromo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.model.domain.WhatsApp;
import br.edu.infnet.messagepromo.model.service.WhatsAppService;

@Order(7)
@Component
public class WhatsAppTeste implements ApplicationRunner  {

	@Autowired
	private WhatsAppService whatsAppService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		WhatsApp whats = new WhatsApp();
		
		whats.setConteudo("Volutpat proin non gravida non");
		whats.setDataEnvio(LocalDateTime.now());
		whats.setIdentificador("188529");
		whats.setNomeDestinatario("Poazcu");
		whats.setTexto("Adipiscing dictumst nisl sit ultricies auctor velit. ");		
		whatsAppService.incluir(whats);

		
		whats = new WhatsApp();
		
		whats.setConteudo("Conubia at litora gravida pretium enim nec arcu");
		whats.setDataEnvio(LocalDateTime.now());
		whats.setIdentificador("428158");
		whats.setNomeDestinatario("Doazu");
		whats.setTexto("Placerat curae quis adipiscing aptent aenean. cras vel bibendum ");		
		whatsAppService.incluir(whats);

		
		whats = new WhatsApp();
		
		whats.setConteudo("Egestas fames tempus enim proin rhoncus euismod sem litora");
		whats.setDataEnvio(LocalDateTime.now());
		whats.setIdentificador("432101");
		whats.setNomeDestinatario("Unwul");
		whats.setTexto("Leo suspendisse vitae vel justo quisque morbi laoreet massa fusce id");		
		whatsAppService.incluir(whats);

	}


}
