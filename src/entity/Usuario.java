package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usuario implements Serializable, Comparable<Usuario> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idUsuario;
	private String nome;
	private String senha;

	public Usuario() {
	}

	public Usuario(Integer idUsuario, String nome, String senha) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", senha=" + senha + "]";
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int compareTo(Usuario u) {

		return this.idUsuario.compareTo(u.getIdUsuario());
	}

	@Override
	public boolean equals(Object obj) {
		Usuario u = (Usuario) obj;

		return this.getIdUsuario().equals(u.getIdUsuario());

	}
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario(10, "acn@gmail.com", "123");
		Usuario u2 = new Usuario(20, "ju@gmail.com", "123");
		Usuario u3 = new Usuario(30, "maria@gmail.com", "123");
		Usuario u4 = new Usuario(40, "paulogmail.com", "123");
		
		List<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(u4);
		usuarios.add(u1);
		usuarios.add(u3);
		usuarios.add(u2);
		
		usuarios.forEach(System.out::println);
		
		
		Collections.sort(usuarios);
		
		System.out.println();
		usuarios.forEach(System.out::println);
		
		Usuario usuario = new Usuario(10,null,null);
		
		System.out.println();
		
		
		if(usuarios.contains(usuario)) {
			int posicao = usuarios.indexOf(usuario);
			System.out.println(usuarios.get(posicao));
		}
		
	}

}
