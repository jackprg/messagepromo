package br.edu.infnet.messagepromo.model.domain;

import java.util.Date;

public class Mensagem {
	
	private Integer id;
	
	private String nomeDestinatario;
	
	private String conteudo;
	
	private Date dataEnvio;

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

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	@Override
	public String toString() {
		return String.format("%d;%s;%s;%s", this.id, this.nomeDestinatario, this.conteudo, this.dataEnvio.toString());
	}	
}
