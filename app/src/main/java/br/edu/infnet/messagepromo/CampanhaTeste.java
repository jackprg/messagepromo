package br.edu.infnet.messagepromo;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.model.data.Campanha;
import br.edu.infnet.messagepromo.model.data.Cliente;
import br.edu.infnet.messagepromo.model.data.Email;
import br.edu.infnet.messagepromo.model.data.Mensagem;
import br.edu.infnet.messagepromo.model.data.SMS;
import br.edu.infnet.messagepromo.model.data.Usuario;
import br.edu.infnet.messagepromo.model.data.WhatsApp;
import br.edu.infnet.messagepromo.model.service.CampanhaService;
import br.edu.infnet.messagepromo.model.service.ClienteService;
import br.edu.infnet.messagepromo.model.service.EmailService;
import br.edu.infnet.messagepromo.model.service.SMSService;
import br.edu.infnet.messagepromo.model.service.UsuarioService;
import br.edu.infnet.messagepromo.model.service.WhatsAppService;

@Order(7)
@Component
public class CampanhaTeste implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private EmailService emailService;

	@Autowired
	private SMSService smsService;

	@Autowired
	private WhatsAppService whatsAppService;

	@Autowired
	private CampanhaService campanhaService;
	
	@Autowired
	private UsuarioService usuarioService;

	private Email email;

	private SMS sms;

	private WhatsApp whatsApp;
	
	private Usuario usuario;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("## Cadastramento de Campanhas ##");
		
		this.usuario = this.getUsuario();

		carregarMensagens();

		Campanha campanha = criarCampanha1();
		System.out.println(this.campanhaService.save(campanha));

		campanha = criarCampanha2();
		System.out.println(this.campanhaService.save(campanha));

		campanha = criarCampanha3();
		System.out.println(this.campanhaService.save(campanha));
	}

	private void carregarMensagens() {
		Email email = new Email();

		email.setAssunto("Lorem ipsum lobortis metus ultricies ligula placerat tellus ultricies placerat");
		email.setConteudo(
				"Lorem ipsum lobortis metus ultricies ligula placerat tellus ultricies placerat mi eleifend, aenean quam elementum erat molestie est curae nullam blandit eu ut eros, euismod cubilia luctus ultrices vestibulum fusce nam euismod convallis habitasse. litora nisl habitant nam fusce maecenas primis eros praesent aliquet consequat pretium maecenas, risus netus platea viverra suscipit placerat aliquam odio duis donec. gravida vulputate potenti suscipit nisl tortor augue lorem blandit tortor");
		email.setCorpoEmail("");
		email.setDataEnvio(LocalDateTime.now());
		email.setEmailDestinatario("cueru@email.com");
		email.setNomeDestinatario("Cueru");
		email.setUsuario(this.usuario);

		this.email = this.emailService.save(email);

		SMS sms = new SMS();

		sms.setConteudo(
				"Non blandit habitasse cursus quis tortor vitae quisque blandit molestie placerat senectus suscipit tristique");
		sms.setDataEnvio(LocalDateTime.now());
		sms.setNomeDestinatario("Buecabor");
		sms.setOperadora("VIVO");
		sms.setTelefone("90894749000");
		sms.setTexto(
				"Enectus ante torquent ipsum in turpis laoreet cursus ut integer imperdiet. aptent sociosqu nullam augue justo nullam pretium porta feugiat primis mi imperdiet auctor");
		sms.setUsuario(this.usuario);
		
		this.sms = this.smsService.save(sms);

		WhatsApp whats = new WhatsApp();

		whats.setConteudo(
				"Volutpat proin non gravida non auctor lorem tortor aptent, cubilia gravida hac ut quam eu ultrices ultricies");
		whats.setDataEnvio(LocalDateTime.now());
		whats.setIdentificador("188529");
		whats.setNomeDestinatario("Poazcu");
		whats.setTexto(
				"Adipiscing dictumst nisl sit ultricies auctor velit. curae senectus malesuada amet aliquet a nunc");
		whats.setUsuario(this.usuario);

		this.whatsApp = this.whatsAppService.save(whats);
	}

	private Campanha criarCampanha1() {
		Cliente cliente = new Cliente();

		cliente.setCnpj("80522996000134");
		cliente.setRazaoSocial("Voruester Ltda");
		cliente.setSaldoEnvio(21);
		cliente.setTelefone("54996076622");
		cliente.setUsuario(this.usuario);

		cliente = this.clienteService.save(cliente);

		Campanha campanha = new Campanha();

		campanha.setDataHoraInicio(LocalDateTime.now());
		campanha.setDescricao("Carol M. Atkins");
		campanha.setTotalMensagens(11);
		campanha.setCliente(cliente);
		campanha.setMensagens(new ArrayList<Mensagem>());
		campanha.setUsuario(this.usuario);

		campanha.getMensagens().add(email);
		campanha.getMensagens().add(sms);
		campanha.getMensagens().add(whatsApp);

		return campanha;
	}

	private Campanha criarCampanha2() {
		Cliente cliente = new Cliente();

		cliente.setCnpj("88971396000165");
		cliente.setRazaoSocial("Voruester Ltda");
		cliente.setSaldoEnvio(21);
		cliente.setTelefone("54996076622");
		cliente.setUsuario(this.usuario);

		cliente = this.clienteService.save(cliente);

		Campanha campanha = new Campanha();

		campanha.setDataHoraInicio(LocalDateTime.now());
		campanha.setDescricao("Patricia T. Contreras");
		campanha.setTotalMensagens(34);
		campanha.setCliente(cliente);
		campanha.setMensagens(new ArrayList<Mensagem>());
		campanha.setUsuario(this.usuario);

		campanha.getMensagens().add(email);
		campanha.getMensagens().add(sms);

		return campanha;
	}

	private Campanha criarCampanha3() {
		Cliente cliente = new Cliente();

		cliente.setCnpj("93033342000199");
		cliente.setRazaoSocial("Voruester Ltda");
		cliente.setSaldoEnvio(21);
		cliente.setTelefone("54996076622");
		cliente.setUsuario(this.usuario);

		cliente = this.clienteService.save(cliente);

		Campanha campanha = new Campanha();

		campanha.setDataHoraInicio(LocalDateTime.now());
		campanha.setDescricao("Robin P. Cochran");
		campanha.setTotalMensagens(44);
		campanha.setCliente(cliente);
		campanha.setMensagens(new ArrayList<Mensagem>());
		campanha.setUsuario(this.usuario);

		campanha.getMensagens().add(email);
		campanha.getMensagens().add(sms);

		return campanha;
	}
	
	private Usuario getUsuario() {
		Usuario u1 = new Usuario();
		u1.setEmail("admin@admin.com");
		u1.setNome("Administrador");
		u1.setSenha("123");

		return usuarioService.save(u1);
	}
}
