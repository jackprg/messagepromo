package br.edu.infnet.messagepromo.model.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "mensagem")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Mensagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeDestinatario;
	
	private String conteudo;
	
	@DateTimeFormat(pattern="dd/MM/yyyy HH:mm")  // or any pattern you prefer 
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
