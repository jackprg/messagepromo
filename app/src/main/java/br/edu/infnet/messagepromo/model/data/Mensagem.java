package br.edu.infnet.messagepromo.model.data;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class Mensagem {

	private Integer id;

	private String nomeDestinatario;

	private String conteudo;

    @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
	private LocalDateTime dataEnvio;

	private float custoEnvio;

	private Usuario usuario;

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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return String.format("%d;%s;%s;%s", this.id, this.nomeDestinatario, this.conteudo, this.dataEnvio.toString());
	}
}
