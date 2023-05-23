package Questão02;

public class Livro extends Produto{
	
	public Livro(double preco, double imposto, String nome) {
		super(preco, imposto, nome);
	}
	
	@Override
	public double calcularPreco(){
		double precoLivro = preco * imposto;
		
		return preco + precoLivro;
	}
	
	@Override
	public void imprimirDetalhes() {
		System.out.println("Título: "+nome);
	}
}