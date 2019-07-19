package Agenda;

public class Contato {
	private String nome;
	private String telefoneResidencial;
	private String telefoneCelular;
	private String email;
	
	public Contato() {
		super();
	}
	
	public Contato(String nome, String telefoneResidencial, String telefoneCelular, String email) {
		super();
		this.nome = nome;
		this.telefoneResidencial = telefoneResidencial;
		this.telefoneCelular = telefoneCelular;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "[Nome=" + nome + ", Telefone residencial=" + telefoneResidencial + ", Telefone celular="
				+ telefoneCelular + ", Email=" + email + "]";
	}
	
}
