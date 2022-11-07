package br.edu.infnet.messagepromo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.model.domain.Cliente;
import br.edu.infnet.messagepromo.model.domain.Usuario;
import br.edu.infnet.messagepromo.model.service.ClienteService;

@Order(3)
@Component
public class ClienteTeste implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Cliente cliente = new Cliente();
		
		cliente.setCnpj("80.522.996/0001-34");
		cliente.setRazaoSocial("Voruester Ltda");
		cliente.setSaldoEnvio(21);
		cliente.setTelefone("54996076622");
		cliente.setUsuario(usuario);
		
		clienteService.incluir(cliente);

		cliente = new Cliente();
		
		cliente.setCnpj("38.131.059/0001-91");
		cliente.setRazaoSocial("Taoduir Ltda");
		cliente.setSaldoEnvio(22);
		cliente.setTelefone("11955442211");
		cliente.setUsuario(usuario);
		
		clienteService.incluir(cliente);


		cliente = new Cliente();
		
		cliente.setCnpj("50.205.319/0001-21");
		cliente.setRazaoSocial("Dipyegk Ltda");
		cliente.setSaldoEnvio(33);
		cliente.setTelefone("23988775544");
		cliente.setUsuario(usuario);
		
		clienteService.incluir(cliente);
	}
}
