package br.edu.infnet.messagepromo.model.domain;

public class Email extends Mensagem 
{
	private String emailDestinatario;
	
	private String assunto;
	
	private String corpoEmail;

	public String getEmailDestinatario() {
		return emailDestinatario;
	}

	public void setEmailDestinatario(String emailDestinatario) {
		this.emailDestinatario = emailDestinatario;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getCorpoEmail() {
		return corpoEmail;
	}

	public void setCorpoEmail(String corpoEmail) {
		this.corpoEmail = corpoEmail;
	}
	

	@Override
	public String toString() {
		return String.format("%s;%s;%s", this.assunto, this.emailDestinatario, super.toString());
	}
	
	
}
