package br.edu.infnet.messagepromo.model.data;

public class Usuario {
	
	private Integer id;
	
	private String nome;
	
	private String email;
	
	private String senha;
	
	private Endereco endereco;
	
	@Override
	public String toString() {
		return id + ";" + nome + ";" + email + ";" + senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = (email != null ? email : "").trim().toUpperCase();
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}