package br.edu.infnet.messagepromo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.model.data.Usuario;
import br.edu.infnet.messagepromo.model.data.WhatsApp;
import br.edu.infnet.messagepromo.model.service.UsuarioService;
import br.edu.infnet.messagepromo.model.service.WhatsAppService;

@Order(5)
@Component
public class WhatsAppTeste implements ApplicationRunner {
	
	@Autowired
	private WhatsAppService whatsAppService;

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de WhatsApp ##");
		
		Usuario usuario = this.getUsuario();

		WhatsApp whats = new WhatsApp();

		whats.setConteudo("Volutpat proin non gravida non");
		whats.setDataEnvio(LocalDateTime.now());
		whats.setIdentificador("188529");
		whats.setNomeDestinatario("Poazcu");
		whats.setTexto("Adipiscing dictumst nisl sit ultricies auctor velit. ");
		whats.setUsuario(usuario);

		System.out.println(whatsAppService.save(whats));

		whats = new WhatsApp();

		whats.setConteudo("Conubia at litora gravida pretium enim nec arcu");
		whats.setDataEnvio(LocalDateTime.now());
		whats.setIdentificador("428158");
		whats.setNomeDestinatario("Doazu");
		whats.setTexto("Placerat curae quis adipiscing aptent aenean. cras vel bibendum ");
		whats.setUsuario(usuario);

		System.out.println(whatsAppService.save(whats));

		whats = new WhatsApp();

		whats.setConteudo("Egestas fames tempus enim proin rhoncus euismod sem litora");
		whats.setDataEnvio(LocalDateTime.now());
		whats.setIdentificador("432101");
		whats.setNomeDestinatario("Unwul");
		whats.setTexto("Leo suspendisse vitae vel justo quisque morbi laoreet massa fusce id");
		whats.setUsuario(usuario);
		System.out.println(whatsAppService.save(whats));

	}
	
	private Usuario getUsuario() {
		Usuario u1 = new Usuario();
		u1.setEmail("admin@admin.com");
		u1.setNome("Administrador");
		u1.setSenha("123");

		return usuarioService.save(u1);
	}
}
