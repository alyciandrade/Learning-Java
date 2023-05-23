package Questão02;

public class DVD extends Produto{
		
	public DVD(double preco, double imposto, String nome) {
		super(preco, imposto, nome);
	}
	
	@Override
	public double calcularPreco(){
		double precoDVD = preco * imposto;
		
		return preco + precoDVD;
	}
	
	@Override
	public void imprimirDetalhes() {
		System.out.println("Título: "+nome);
	}

}