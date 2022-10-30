package br.edu.infnet.messagepromo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.messagepromo.model.domain.Mensagem;

@Controller
public class MensagemController {
	private static Map<Integer, Mensagem> mapa = new HashMap<Integer, Mensagem>();	
	private static Integer id = 1;

	public static void incluir(Mensagem mensagem) {
		mensagem.setId(id++);
		mapa.put(mensagem.getId(), mensagem);
		
		System.out.println("> " + mensagem);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Mensagem> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/mensagem/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "mensagem/lista";
	}
	
	@GetMapping(value = "/mensagem/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/mensagem/lista";
	}
}
