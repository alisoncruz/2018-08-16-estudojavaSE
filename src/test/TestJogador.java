package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import entity.Jogador;

public class TestJogador {

	private Jogador jogador;
	
	@Before
	public void init() {
		this.jogador = new Jogador();
	}
	
	@Test
	public void testarIdNull() {
		this.jogador.setIdJogador(null);
		assertNotNull(this.jogador.getIdJogador());
	}
}
