package entity;

import java.io.Serializable;
import java.util.Date;

public class Curso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer idCurso;
	private Aluno aluno;
	private Disciplina disciplina;
	private Date dataCurso;
	private Double nota1;
	private Double nota2;
	private Double media;
	private String situacao;

	public Curso() {
	}

	public Curso(Integer idCurso, Aluno aluno, Disciplina disciplina, Date dataCurso) {
		this.idCurso = idCurso;
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.dataCurso = dataCurso;
	}

	
	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", aluno=" + aluno + ", disciplina=" + disciplina + ", dataCurso="
				+ dataCurso + ", nota1=" + nota1 + ", nota2=" + nota2 + ", media=" + media + ", situacao=" + situacao
				+ "]";
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getDataCurso() {
		return dataCurso;
	}

	public void setDataCurso(Date dataCurso) {
		this.dataCurso = dataCurso;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public void calcularMedia() {
		this.setMedia((this.getNota1() + this.getNota2()) / 2);
	}

	public void definirSituacao() {
		this.setSituacao((this.getMedia()<7)?"aprovado":"reprovado");
	}

}
