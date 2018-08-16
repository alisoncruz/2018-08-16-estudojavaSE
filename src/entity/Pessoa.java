package entity;

public abstract class Pessoa {

	private String nome;
	private String sexo;
	private String email;

	public Pessoa() {
	}

	public Pessoa(String nome, String sexo, String email) {
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", email=" + email + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
