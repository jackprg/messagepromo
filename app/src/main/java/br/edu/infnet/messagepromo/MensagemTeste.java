package br.edu.infnet.messagepromo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.model.data.Email;
import br.edu.infnet.messagepromo.model.data.SMS;
import br.edu.infnet.messagepromo.model.data.Usuario;
import br.edu.infnet.messagepromo.model.data.WhatsApp;
import br.edu.infnet.messagepromo.model.service.EmailService;
import br.edu.infnet.messagepromo.model.service.SMSService;
import br.edu.infnet.messagepromo.model.service.UsuarioService;
import br.edu.infnet.messagepromo.model.service.WhatsAppService;


@Order(6)
@Component
public class MensagemTeste implements ApplicationRunner {
		

	@Autowired
	private EmailService emailService;
	
	@Autowired
	private SMSService smsService;
	
	@Autowired
	private WhatsAppService whatsAppService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Mensagems ##");
		
		Usuario usuario = this.getUsuario();

		Email email = new Email();
		
		email.setAssunto("Lorem ipsum lobortis metus ultricies ligula placerat tellus ultricies placerat");
		email.setConteudo("Lorem ipsum lobortis metus ultricies ligula placerat tellus ultricies placerat mi eleifend");
		email.setCorpoEmail("");
		email.setDataEnvio(LocalDateTime.now());
		email.setEmailDestinatario("cueru@email.com");
		email.setNomeDestinatario("Cueru");
		email.setUsuario(usuario);
		System.out.println(emailService.save(email));
		
		SMS sms = new SMS();
		
		sms.setConteudo("Non blandit habitasse cursus quis tortor vitae quisque ");
		sms.setDataEnvio(LocalDateTime.now());
		sms.setNomeDestinatario("Buecabor");
		sms.setOperadora("VIVO");
		sms.setTelefone("90894749000");
		sms.setTexto("Enectus ante torquent ipsum in turpis laoreet cursus ut integer imperdiet. ");
		sms.setUsuario(usuario);
		System.out.println(smsService.save(sms));
		
		WhatsApp whats = new WhatsApp();
		
		whats.setConteudo("Volutpat proin non gravida non auctor lorem tortor aptent");
		whats.setDataEnvio(LocalDateTime.now());
		whats.setIdentificador("188529");
		whats.setNomeDestinatario("Poazcu");
		whats.setTexto("Adipiscing dictumst nisl sit ultricies auctor velit. curae senectus malesuada amet aliquet a nunc");
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
