package entity;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jogador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer idJogador;
	private String nome;
	private Integer pontos = 0;

	public Jogador() {
	}

	public Jogador(Integer idJogador, String nome, Integer pontos) {
		this.idJogador = idJogador;
		this.nome = nome;
		this.pontos = pontos;
	}

	@Override
	public String toString() {
		return "Jogador [idJogador=" + idJogador + ", nome=" + nome + ", pontos=" + pontos + "]";
	}

	public Integer getIdJogador() {
		return idJogador;
	}

	public void setIdJogador(Integer idJogador) {
		this.idJogador = idJogador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public void gerarPontos() {
		int ponto = (int) (Math.random() * (10 - 0) + 1) + 0;

		this.pontos = ponto;
	}

	public Boolean isNome() {
		
		if(nome == null) {
			return false;
		}
		Pattern p = Pattern.compile("[a-z A-Z]{2,70}");
		Matcher m = p.matcher(this.nome);

		return m.matches();

	}
	
	
	public Boolean isId() {
		if(idJogador==null) {
			return false;
		}
		if(idJogador <=0) {
			return false;
		}
		
		return true;
	}

	public static void main(String[] args) {

		Jogador j = new Jogador();

		j.setNome("alison");

		
		System.out.println(j.isNome());

	}

}
