package br.edu.infnet.messagepromo.model.domain;

public class Cliente {
	private Integer id;

	private String razaoSocial;

	private String cnpj;

	private String telefone;

	private int saldoEnvio;
	
	private boolean ativo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getSaldoEnvio() {
		return saldoEnvio;
	}

	public void setSaldoEnvio(int saldoEnvio) {
		this.saldoEnvio = saldoEnvio;
	}
	
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return String.format("%d;%s;%s;%s", this.id, this.razaoSocial, this.cnpj, this.telefone);
	}

}
