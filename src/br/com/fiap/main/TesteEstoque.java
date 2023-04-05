package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Produto;

public class TesteEstoque {
	public static void main(String[] args) {
		Produto objProduto = new Produto(JOptionPane.showInputDialog("Digite o tipo do produto"),
				JOptionPane.showInputDialog("Digite a marca do produto"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto")));
			
		Cliente objCliente = new Cliente(JOptionPane.showInputDialog("Digite seu nome"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite sua renda")),
				objProduto);
		
		System.out.println(
				"Nome: " + objCliente.getNome() +
				"\nIdade: " + objCliente.getIdade() +
				"\nRenda Média: " + objCliente.getRendaMedia() +
				"\n\nTipo do produto: " + objProduto.getTipo() +
				"\nMarca do produto: " + objProduto.getMarca() +
				"\nQuantidade: " + objProduto.getQuantidade() +
				"\nValor do produto: " + objProduto.getValor()
				
		);
	}
}
