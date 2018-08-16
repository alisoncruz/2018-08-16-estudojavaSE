package view;

import javax.swing.JOptionPane;

import entity.Cliente;

public class InputCliente {

	public String lerNome() {
		String nome = JOptionPane.showInputDialog("Digite o nome:");
		return nome;
	}

	public String lerEmail() {
		String email = JOptionPane.showInputDialog("Digite o email:");
		return email;
	}

	public String lerSexo() {
		String sexo = JOptionPane.showInputDialog("Digite o sexo:");
		return sexo;
	}

	public String lerNomePlano() {
		String nomePlano = JOptionPane.showInputDialog("Digite o nome do plano:");
		return nomePlano;
	}

	public Double lerValorPlano() {
		Double valor = Double.valueOf(JOptionPane.showInputDialog("Digite o valor:"));
		return valor;
	}
	
	public Integer lerId() {
		Integer id = Integer.valueOf(JOptionPane.showInputDialog("Digite o id:"));
		return id;
	}

	public static void main(String[] args) {

		InputCliente inputCliente = new InputCliente();
		
		Cliente c = new Cliente();
		
		c.setIdCliente(inputCliente.lerId());
		c.setNome(inputCliente.lerNome());
		c.setSexo(inputCliente.lerSexo());
		c.setEmail(inputCliente.lerEmail());
		c.setNomePlano(inputCliente.lerNomePlano());
		c.setValorPlano(inputCliente.lerValorPlano());
		
		
		System.out.println(c);
		
		
	}
}
