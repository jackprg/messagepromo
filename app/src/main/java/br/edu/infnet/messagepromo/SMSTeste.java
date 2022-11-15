package br.edu.infnet.messagepromo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.model.data.SMS;
import br.edu.infnet.messagepromo.model.data.Usuario;
import br.edu.infnet.messagepromo.model.service.SMSService;
import br.edu.infnet.messagepromo.model.service.UsuarioService;

@Order(4)
@Component
public class SMSTeste implements ApplicationRunner  {

	@Autowired
	private SMSService smsService;

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de SMS ##");
		
		Usuario usuario = this.getUsuario();
		
		SMS sms = new SMS();
		
		sms.setConteudo("Non blandit habitasse cursus quis tortor vitae quisque ");
		sms.setDataEnvio(LocalDateTime.now());
		sms.setNomeDestinatario("Buecabor");
		sms.setOperadora("VIVO");
		sms.setTelefone("90894749000");
		sms.setTexto("Enectus ante torquent ipsum in turpis laoreet cursus ut integer imperdiet. ");
		sms.setUsuario(usuario);
				
		System.out.println(smsService.save(sms));
		

		sms = new SMS();
		
		sms.setConteudo("Iaculis conubia lacus volutpat tristique donec erat curae rhoncus imperdiet");
		sms.setDataEnvio(LocalDateTime.now());
		sms.setNomeDestinatario("Bima");
		sms.setOperadora("OI");
		sms.setTelefone("24095512");
		sms.setTexto("Quam quisque facilisis elit eleifend sit ultricies ante ligula per, quis facilisis eget sagittis ");
		sms.setUsuario(usuario);
		
		System.out.println(smsService.save(sms));

		sms = new SMS();
		
		sms.setConteudo("Lacinia quisque mollis donec vulputate fusce vulputate ");
		sms.setDataEnvio(LocalDateTime.now());
		sms.setNomeDestinatario("Goepe");
		sms.setOperadora("CLARO");
		sms.setTelefone("8845000140");
		sms.setTexto("Nisl curabitur id etiam vehicula adipiscing eleifend. per mattis hac ");
		sms.setUsuario(usuario);

		System.out.println(smsService.save(sms));

	}
	
	private Usuario getUsuario() {
		Usuario u1 = new Usuario();
		u1.setEmail("admin@admin.com");
		u1.setNome("Administrador");
		u1.setSenha("123");

		return usuarioService.save(u1);
	}

	
}
