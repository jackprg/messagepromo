package br.edu.infnet.messagepromo.model.domain;

import java.time.LocalDateTime;

public class Mensagem {
	
	private Integer id;
	
	private String nomeDestinatario;
	
	private String conteudo;
	
	private LocalDateTime dataEnvio;
	
	private float custoEnvio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeDestinatario() {
		return nomeDestinatario;
	}

	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public LocalDateTime getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(LocalDateTime dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	
	public float getCustoEnvio() {
		return custoEnvio;
	}

	public void setCustoEnvio(float custoEnvio) {
		this.custoEnvio = custoEnvio;
	}

	@Override
	public String toString() {
		return String.format("%d;%s;%s;%s", this.id, this.nomeDestinatario, this.conteudo, this.dataEnvio.toString());
	}	
}
