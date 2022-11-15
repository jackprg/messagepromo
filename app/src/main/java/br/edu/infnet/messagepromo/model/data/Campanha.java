package br.edu.infnet.messagepromo.model.data;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Campanha {

	private Integer id;

	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private LocalDateTime dataHoraInicio;

	private int totalMensagens;

	private String descricao;

	private Cliente cliente;

	private List<Mensagem> mensagens;

	private Usuario usuario;

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
		this.descricao = (descricao != null ? descricao : "").trim().toUpperCase();
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return String.format("%d;%s;%s;%s;%d", this.id, this.descricao, this.dataHoraInicio.toString(), this.cliente,
				this.mensagens.size());
	}
}
