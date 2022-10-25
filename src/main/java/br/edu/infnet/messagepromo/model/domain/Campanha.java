package br.edu.infnet.messagepromo.model.domain;

import java.util.Date;

public class Campanha {

	private Integer id;
	
	private Date dataHoraInicio;
	
	private int totalMensagens;

	private String descricao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(Date dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public int getTotalMensagens() {
		return totalMensagens;
	}

	public void setTotalMensagens(int totalMensagens) {
		this.totalMensagens = totalMensagens;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

	@Override
	public String toString() {
		return String.format("%d;%s;%s", this.id, this.descricao, this.dataHoraInicio.toString());
	}
}
