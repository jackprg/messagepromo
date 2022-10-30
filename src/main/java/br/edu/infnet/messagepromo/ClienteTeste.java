package br.edu.infnet.messagepromo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.controller.ClienteController;
import br.edu.infnet.messagepromo.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner {


	@Override
	public void run(ApplicationArguments args) throws Exception {
		Cliente cliente = new Cliente();
		
		cliente.setCnpj("80.522.996/0001-34");
		cliente.setRazaoSocial("Voruester Ltda");
		cliente.setSaldoEnvio(21);
		cliente.setTelefone("54996076622");
		
		ClienteController.incluir(cliente);

		cliente = new Cliente();
		
		cliente.setCnpj("38.131.059/0001-91");
		cliente.setRazaoSocial("Taoduir Ltda");
		cliente.setSaldoEnvio(22);
		cliente.setTelefone("11955442211");
		
		ClienteController.incluir(cliente);


		cliente = new Cliente();
		
		cliente.setCnpj("50.205.319/0001-21");
		cliente.setRazaoSocial("Dipyegk Ltda");
		cliente.setSaldoEnvio(33);
		cliente.setTelefone("23988775544");
		
		ClienteController.incluir(cliente);

	}

}
