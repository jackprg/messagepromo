package br.edu.infnet.messagepromo;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.controller.CampanhaController;
import br.edu.infnet.messagepromo.model.domain.Campanha;
import br.edu.infnet.messagepromo.model.domain.Cliente;
import br.edu.infnet.messagepromo.model.domain.Email;
import br.edu.infnet.messagepromo.model.domain.Mensagem;
import br.edu.infnet.messagepromo.model.domain.SMS;
import br.edu.infnet.messagepromo.model.domain.WhatsApp;

@Component
public class CampanhaTeste implements ApplicationRunner {

	private static Email email;
	
	private static SMS sms;
	
	private static WhatsApp whatsApp;
	
		
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		carregarMensagens();
		
		Campanha campanha = criarCampanha1();
		CampanhaController.incluir(campanha);
		
		
		campanha =  criarCampanha2();
		CampanhaController.incluir(campanha);
		

		campanha = criarCampanha3();
		CampanhaController.incluir(campanha);
	}
	
	private static void carregarMensagens()
	{
		Email email = new Email();
		
		email.setAssunto("Lorem ipsum lobortis metus ultricies ligula placerat tellus ultricies placerat");
		email.setConteudo("Lorem ipsum lobortis metus ultricies ligula placerat tellus ultricies placerat mi eleifend, aenean quam elementum erat molestie est curae nullam blandit eu ut eros, euismod cubilia luctus ultrices vestibulum fusce nam euismod convallis habitasse. litora nisl habitant nam fusce maecenas primis eros praesent aliquet consequat pretium maecenas, risus netus platea viverra suscipit placerat aliquam odio duis donec. gravida vulputate potenti suscipit nisl tortor augue lorem blandit tortor");
		email.setCorpoEmail("");
		email.setDataEnvio(LocalDateTime.now());
		email.setEmailDestinatario("cueru@email.com");
		email.setNomeDestinatario("Cueru");
		
		CampanhaTeste.email = email;
		
		
		SMS sms = new SMS();
		
		sms.setConteudo("Non blandit habitasse cursus quis tortor vitae quisque blandit molestie placerat senectus suscipit tristique");
		sms.setDataEnvio(LocalDateTime.now());
		sms.setNomeDestinatario("Buecabor");
		sms.setOperadora("VIVO");
		sms.setTelefone("90894749000");
		sms.setTexto("Enectus ante torquent ipsum in turpis laoreet cursus ut integer imperdiet. aptent sociosqu nullam augue justo nullam pretium porta feugiat primis mi imperdiet auctor");
		
		CampanhaTeste.sms = sms;
		
		
		WhatsApp whats = new WhatsApp();
		
		whats.setConteudo("Volutpat proin non gravida non auctor lorem tortor aptent, cubilia gravida hac ut quam eu ultrices ultricies");
		whats.setDataEnvio(LocalDateTime.now());
		whats.setIdentificador("188529");
		whats.setNomeDestinatario("Poazcu");
		whats.setTexto("Adipiscing dictumst nisl sit ultricies auctor velit. curae senectus malesuada amet aliquet a nunc");	
		
		CampanhaTeste.whatsApp = whats;
	}
	
	private static Campanha criarCampanha1()
	{
		Cliente cliente = new Cliente();
		
		cliente.setCnpj("80.522.996/0001-34");
		cliente.setRazaoSocial("Voruester Ltda");
		cliente.setSaldoEnvio(21);
		cliente.setTelefone("54996076622");		
		
		Campanha campanha = new Campanha();

		campanha.setDataHoraInicio(LocalDateTime.now());
		campanha.setDescricao("Carol M. Atkins");
		campanha.setTotalMensagens(11);
		campanha.setCliente(cliente);
		campanha.setMensagens(new ArrayList<Mensagem>());
		
		campanha.getMensagens().add(email);
		campanha.getMensagens().add(sms);
		campanha.getMensagens().add(whatsApp);
				
		return campanha;
	}

	private static Campanha criarCampanha2()
	{
		Cliente cliente = new Cliente();
		
		cliente.setCnpj("88.971.396/0001-65");
		cliente.setRazaoSocial("Voruester Ltda");
		cliente.setSaldoEnvio(21);
		cliente.setTelefone("54996076622");		
		
		Campanha campanha = new Campanha();

		campanha.setDataHoraInicio(LocalDateTime.now());
		campanha.setDescricao("Patricia T. Contreras");
		campanha.setTotalMensagens(34);
		campanha.setCliente(cliente);
		campanha.setMensagens(new ArrayList<Mensagem>());

		campanha.getMensagens().add(email);
		campanha.getMensagens().add(sms);
			
		return campanha;
	}
	
	private static Campanha criarCampanha3()
	{
		Cliente cliente = new Cliente();
		
		cliente.setCnpj("93.033.342/0001-99");
		cliente.setRazaoSocial("Voruester Ltda");
		cliente.setSaldoEnvio(21);
		cliente.setTelefone("54996076622");		
		
		Campanha campanha = new Campanha();

		campanha.setDataHoraInicio(LocalDateTime.now());
		campanha.setDescricao("Robin P. Cochran");
		campanha.setTotalMensagens(44);
		campanha.setCliente(cliente);
		campanha.setMensagens(new ArrayList<Mensagem>());
		
		campanha.getMensagens().add(email);
		campanha.getMensagens().add(sms);		
		
		return campanha;
	}
}
