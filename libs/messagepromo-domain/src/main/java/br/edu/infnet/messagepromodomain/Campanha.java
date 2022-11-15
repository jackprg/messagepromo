package br.edu.infnet.messagepromodomain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "campanha")
public class Campanha {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDateTime dataHoraInicio;

	private int totalMensagens;

	private String descricao;

	@OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "clienteid")
	private Cliente cliente;

	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Mensagem> mensagens;
	
	@ManyToOne
	@JoinColumn(name = "usuarioid")
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
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return String.format("%d;%s;%s;%s;%d", this.id, this.descricao, this.dataHoraInicio.toString(), this.cliente, this.mensagens.size());
	}
}
