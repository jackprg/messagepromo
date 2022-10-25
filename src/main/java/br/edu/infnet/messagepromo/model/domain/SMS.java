package br.edu.infnet.messagepromo.model.domain;

public class SMS extends Mensagem {
	private String telefone;

	private String operadora;

	private String texto;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return String.format("%s;%s;%s;%s", this.operadora, this.telefone, this.texto, super.toString());
	}
}
