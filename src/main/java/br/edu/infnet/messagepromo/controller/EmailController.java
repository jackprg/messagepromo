package br.edu.infnet.messagepromo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.messagepromo.model.domain.Email;

@Controller
public class EmailController {
	private static Map<Integer, Email> mapa = new HashMap<Integer, Email>();	
	private static Integer id = 1;

	public static void incluir(Email email) {
		email.setId(id++);
		mapa.put(email.getId(), email);
		
		System.out.println("> " + email);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Email> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/email/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "email/lista";
	}
	
	@GetMapping(value = "/email/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/email/lista";
	}
}
