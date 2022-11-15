package br.edu.infnet.messagepromo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.model.data.Cliente;
import br.edu.infnet.messagepromo.model.data.Usuario;
import br.edu.infnet.messagepromo.model.service.ClienteService;
import br.edu.infnet.messagepromo.model.service.UsuarioService;

@Order(2)
@Component
public class ClienteTeste implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Clientes ##");
		
		Usuario usuario = this.getUsuario();
		
		Cliente cliente = new Cliente();
		
		cliente.setCnpj("80522996000134");
		cliente.setRazaoSocial("Voruester Ltda");
		cliente.setSaldoEnvio(21);
		cliente.setTelefone("54996076622");
		cliente.setUsuario(usuario);
		cliente.setAtivo(true);
				
		System.out.println(clienteService.save(cliente));
		

		cliente = new Cliente();
		
		cliente.setCnpj("38131059000191");
		cliente.setRazaoSocial("Taoduir Ltda");
		cliente.setSaldoEnvio(22);
		cliente.setTelefone("11955442211");
		cliente.setUsuario(usuario);
		cliente.setAtivo(true);
		
		System.out.println(clienteService.save(cliente));


		cliente = new Cliente();
		
		cliente.setCnpj("50205319000121");
		cliente.setRazaoSocial("Dipyegk Ltda");
		cliente.setSaldoEnvio(33);
		cliente.setTelefone("23988775544");
		cliente.setUsuario(usuario);
		cliente.setAtivo(true);
		
		System.out.println(clienteService.save(cliente));
	}
	
	private Usuario getUsuario() {
		Usuario u1 = new Usuario();
		u1.setEmail("admin@admin.com");
		u1.setNome("Administrador");
		u1.setSenha("123");

		return usuarioService.save(u1);
	}
}
