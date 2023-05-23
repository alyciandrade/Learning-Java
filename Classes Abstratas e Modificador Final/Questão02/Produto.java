package Questão02;

public abstract class Produto {
	
	double preco;
	double imposto;
	String nome;
	
	public Produto(double preco, double imposto, String nome) {
		this.preco = preco;
		this.imposto = imposto;
		this.nome = nome;
	}
	
	public abstract double calcularPreco();
	
	public void imprimirDetalhes() {
		
	}

}
