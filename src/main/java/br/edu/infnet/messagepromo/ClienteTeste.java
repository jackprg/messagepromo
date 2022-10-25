package br.edu.infnet.messagepromo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner {


	@Override
	public void run(ApplicationArguments args) throws Exception {
		Cliente cliente = new Cliente();
		
		cliente.setCnpj("80.522.996/0001-34");
		cliente.setId(1);
		cliente.setRazaoSocial("Voruester Ltda");
		cliente.setSaldoEnvio(21);
		cliente.setTelefone("54996076622");
		
		System.out.println(String.format("Cliente - %s", cliente.toString()));

		cliente = new Cliente();
		
		cliente.setCnpj("38.131.059/0001-91");
		cliente.setId(2);
		cliente.setRazaoSocial("Taoduir Ltda");
		cliente.setSaldoEnvio(22);
		cliente.setTelefone("11955442211");
		
		System.out.println(String.format("Cliente - %s", cliente.toString()));


		cliente = new Cliente();
		
		cliente.setCnpj("50.205.319/0001-21");
		cliente.setId(3);
		cliente.setRazaoSocial("Dipyegk Ltda");
		cliente.setSaldoEnvio(33);
		cliente.setTelefone("23988775544");
		
		System.out.println(String.format("Cliente - %s", cliente.toString()));

	}

}
