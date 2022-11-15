package br.edu.infnet.messagepromo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.messagepromo.model.data.Usuario;
import br.edu.infnet.messagepromo.model.service.MensagemService;

@Controller
public class MensagemController {

	@Autowired
	private MensagemService mensagemService;

	@GetMapping(value = "/mensagem/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", mensagemService.obterLista(usuario.getId()));

		return "mensagem/lista";
	}

}
