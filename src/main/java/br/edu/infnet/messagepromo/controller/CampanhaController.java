package br.edu.infnet.messagepromo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.messagepromo.model.domain.Campanha;

@Controller
public class CampanhaController {
	private static Map<Integer, Campanha> mapa = new HashMap<Integer, Campanha>();	
	private static Integer id = 1;

	public static void incluir(Campanha campanha) {
		campanha.setId(id++);
		mapa.put(campanha.getId(), campanha);
		
		System.out.println("> " + campanha);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Campanha> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/campanha/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "campanha/lista";
	}
	
	@GetMapping(value = "/campanha/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/campanha/lista";
	}
}
