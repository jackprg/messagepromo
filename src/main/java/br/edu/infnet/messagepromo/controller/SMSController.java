package br.edu.infnet.messagepromo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.messagepromo.model.domain.SMS;

@Controller
public class SMSController {
	private static Map<Integer, SMS> mapa = new HashMap<Integer, SMS>();	
	private static Integer id = 1;

	public static void incluir(SMS sms) {
		sms.setId(id++);
		mapa.put(sms.getId(), sms);
		
		System.out.println("> " + sms);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<SMS> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/sms/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "sms/lista";
	}
	
	@GetMapping(value = "/sms/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/sms/lista";
	}
}
