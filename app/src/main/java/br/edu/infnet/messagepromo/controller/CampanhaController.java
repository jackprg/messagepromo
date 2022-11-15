package br.edu.infnet.messagepromo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.messagepromo.model.data.Campanha;
import br.edu.infnet.messagepromo.model.data.Usuario;
import br.edu.infnet.messagepromo.model.service.CampanhaService;
import br.edu.infnet.messagepromo.model.service.ClienteService;
import br.edu.infnet.messagepromo.model.service.MensagemService;

@Controller
public class CampanhaController {

	@Autowired
	private CampanhaService campanhaService;

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private MensagemService mensagemService;

	@GetMapping(value = "/campanha")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("clientes", clienteService.obterLista(usuario.getId()));

		model.addAttribute("mensagens", mensagemService.obterLista(usuario.getId()));

		return "campanha/cadastro";
	}

	@GetMapping(value = "/campanha/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", campanhaService.obterLista(usuario.getId()));

		return "campanha/lista";
	}

	@PostMapping(value = "/campanha/incluir")
	public String incluir(Campanha campanha, @SessionAttribute("user") Usuario usuario,
			@RequestBody MultiValueMap<String, String> formData) {

		String clienteIdParam = formData.getFirst("clienteid");

		if (clienteIdParam != null && clienteIdParam != "")
			campanha.setCliente(this.clienteService.obter(Integer.valueOf(clienteIdParam)));

		campanha.setMensagens(new ArrayList<>());

		for (String mensagemid : formData.getOrDefault("mensagemid", new ArrayList<>())) {
			campanha.getMensagens().add(this.mensagemService.obter(Integer.valueOf(mensagemid)));
		}

		campanha.setUsuario(usuario);

		campanhaService.incluir(campanha);

		return "redirect:/campanha/lista";
	}

	@GetMapping(value = "/campanha/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		campanhaService.excluir(id);

		return "redirect:/campanha/lista";
	}
}
