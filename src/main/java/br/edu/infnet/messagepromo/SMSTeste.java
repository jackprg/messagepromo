package br.edu.infnet.messagepromo;

import java.util.Date;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.model.domain.SMS;

@Component
public class SMSTeste implements ApplicationRunner  {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		SMS sms = new SMS();
		
		sms.setConteudo("Non blandit habitasse cursus quis tortor vitae quisque blandit molestie placerat senectus suscipit tristique");
		sms.setDataEnvio(new Date());
		sms.setId(1);
		sms.setNomeDestinatario("Buecabor");
		sms.setOperadora("VIVO");
		sms.setTelefone("90894749000");
		sms.setTexto("Enectus ante torquent ipsum in turpis laoreet cursus ut integer imperdiet. aptent sociosqu nullam augue justo nullam pretium porta feugiat primis mi imperdiet auctor");
		
		System.out.println(String.format("SMS - %s", sms.toString()));
		

		sms = new SMS();
		
		sms.setConteudo("Iaculis conubia lacus volutpat tristique donec erat curae rhoncus imperdiet, diam vehicula fusce dictumst");
		sms.setDataEnvio(new Date());
		sms.setId(2);
		sms.setNomeDestinatario("Bima");
		sms.setOperadora("OI");
		sms.setTelefone("24095512");
		sms.setTexto("Quam quisque facilisis elit eleifend sit ultricies ante ligula per, quis facilisis eget sagittis elementum integer ultrices sagittis");
		
		System.out.println(String.format("SMS - %s", sms.toString()));

		sms = new SMS();
		
		sms.setConteudo("Lacinia quisque mollis donec vulputate fusce vulputate semper torquent vitae mauris, aliquam justo");
		sms.setDataEnvio(new Date());
		sms.setId(3);
		sms.setNomeDestinatario("Goepe");
		sms.setOperadora("CLARO");
		sms.setTelefone("8845000140");
		sms.setTexto("Nisl curabitur id etiam vehicula adipiscing eleifend. per mattis hac nec ullamcorper consectetur scelerisque");
		
		System.out.println(String.format("SMS - %s", sms.toString()));

	}

	
}
