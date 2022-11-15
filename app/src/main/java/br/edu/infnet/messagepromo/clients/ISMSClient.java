package br.edu.infnet.messagepromo.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.messagepromo.model.data.SMS;

@FeignClient(url = "localhost:8084/api/sms", name = "smsClient")
public interface ISMSClient {

	@PostMapping(value = "/incluir")
	public SMS incluir(@RequestBody SMS sms);

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);

	@GetMapping(value = "/listar")
	public List<SMS> obterLista();
	
	@GetMapping(value = "/listarusuario/{usuarioid}")
	public List<SMS> obterLista(@PathVariable Integer usuarioid);

	@GetMapping(value = "/obterportelefone/{telefone}")
	public SMS obterPorTelefone(@PathVariable String telefone);
}
