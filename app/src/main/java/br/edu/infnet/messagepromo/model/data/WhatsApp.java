package br.edu.infnet.messagepromo.model.data;

public class WhatsApp extends Mensagem {
	private String identificador;

	private String texto;

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = (identificador != null ? identificador : "").trim().toUpperCase();
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return String.format("%s;%s;%s;%s", super.toString(), this.identificador, this.texto, super.toString());
	}
}
