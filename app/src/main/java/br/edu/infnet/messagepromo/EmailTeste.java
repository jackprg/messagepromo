package br.edu.infnet.messagepromo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.model.data.Email;
import br.edu.infnet.messagepromo.model.data.Usuario;
import br.edu.infnet.messagepromo.model.service.EmailService;
import br.edu.infnet.messagepromo.model.service.UsuarioService;

@Order(3)
@Component
public class EmailTeste implements ApplicationRunner {

	@Autowired
	private EmailService emailService;

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Emails ##");
		
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

		email = new Email();

		email.setAssunto("Egestas non eu nam ac accumsan elementum");
		email.setConteudo("Egestas non eu nam ac accumsan elementum lobortis ");
		email.setCorpoEmail("Sed blandit nulla ultrices accumsan sit rutrum vehicula");
		email.setDataEnvio(LocalDateTime.now());
		email.setEmailDestinatario("barli@email.com");
		email.setNomeDestinatario("Barli");
		email.setUsuario(usuario);
		System.out.println(emailService.save(email));

		email = new Email();

		email.setAssunto("Sed eros molestie aenean rhoncus curabitur ultricies");
		email.setConteudo("Sed eros molestie aenean rhoncus curabitur ultricies interdum ");
		email.setCorpoEmail("elementum cubilia sodales posuere tempor malesuada");
		email.setDataEnvio(LocalDateTime.now());
		email.setEmailDestinatario("toias@email.com");
		email.setNomeDestinatario("Toias");
		email.setUsuario(usuario);
		System.out.println(emailService.save(email));

	}

	private Usuario getUsuario() {
		Usuario u1 = new Usuario();
		u1.setEmail("admin@admin.com");
		u1.setNome("Administrador");
		u1.setSenha("123");

		return usuarioService.save(u1);
	}

}
