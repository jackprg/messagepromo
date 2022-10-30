package br.edu.infnet.messagepromo.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Campanha {

	private Integer id;

	private LocalDateTime dataHoraInicio;

	private int totalMensagens;

	private String descricao;

	private Cliente cliente;

	private List<Mensagem> mensagens;

	public Campanha() {
		this.dataHoraInicio = LocalDateTime.now();
		this.totalMensagens = 0;
	}

	public Campanha(Cliente cliente) {
		this();
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public void setMensagens(List<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}

	@Override
	public String toString() {
		return String.format("%d;%s;%s;%s;%d", this.id, this.descricao, this.dataHoraInicio.toString(), this.cliente, this.mensagens.size());
	}
}
