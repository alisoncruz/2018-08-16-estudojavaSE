package entity;

import java.io.Serializable;
import java.util.Date;

public class Aluno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer idAluno;
	private String nome;
	private String email;

	// One to One
	private Curso curso;

	public Aluno() {
	}

	public Aluno(Integer idAluno, String nome, String email) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nome=" + nome + ", email=" + email + "]";
	}

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
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
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public static void main(String[] args) {

		Aluno a = new Aluno(10, "alison", "acn@gmail.com");

		Disciplina d = new Disciplina(20, "java");

		Curso c = new Curso(50, a, d, new Date());
		
		c.setNota1(6.);
		c.setNota2(8.);
		
		c.calcularMedia();
		
		c.definirSituacao();
		
		System.out.println(c);

	}

}
