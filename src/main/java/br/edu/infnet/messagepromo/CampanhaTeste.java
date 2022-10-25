package br.edu.infnet.messagepromo;

import java.util.Date;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.messagepromo.model.domain.Campanha;

@Component
public class CampanhaTeste implements ApplicationRunner {


	@Override
	public void run(ApplicationArguments args) throws Exception {
		Campanha campanha = new Campanha();

		campanha.setDataHoraInicio(new Date());
		campanha.setDescricao("Naunyu");
		campanha.setId(1);
		campanha.setTotalMensagens(11);

		System.out.println(String.format("Campanha - %s", campanha.toString()));

		
		campanha = new Campanha();

		campanha.setDataHoraInicio(new Date());
		campanha.setDescricao("Reyvyeri");
		campanha.setId(2);
		campanha.setTotalMensagens(12);

		System.out.println(String.format("Campanha - %s", campanha.toString()));


		campanha = new Campanha();

		campanha.setDataHoraInicio(new Date());
		campanha.setDescricao("Fobehnag");
		campanha.setId(3);
		campanha.setTotalMensagens(13);

		System.out.println(String.format("Campanha - %s", campanha.toString()));		
	}

}
