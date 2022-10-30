package br.edu.infnet.messagepromo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.messagepromo.model.domain.WhatsApp;

@Controller
public class WhatsAppController {
	private static Map<Integer, WhatsApp> mapa = new HashMap<Integer, WhatsApp>();	
	private static Integer id = 1;

	public static void incluir(WhatsApp whatsApp) {
		whatsApp.setId(id++);
		mapa.put(whatsApp.getId(), whatsApp);
		
		System.out.println("> " + whatsApp);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<WhatsApp> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/whatsapp/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "whatsapp/lista";
	}
	
	@GetMapping(value = "/whatsapp/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/whatsapp/lista";
	}
}
