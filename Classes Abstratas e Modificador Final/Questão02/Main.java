package Questão02;

public class Main {

	public static void main(String[] args) {
		Livro livro01 = new Livro(20, 0.05, "O Duque e Eu");
		Livro livro02 = new Livro(22, 0.05, "O Visconde Que Me Amava");
		DVD dvd01 = new DVD(18, 0.03, "Moana: Um Mar De Aventuras");
		DVD dvd02 = new DVD(16, 0.03, "Frozen: Uma Aventura Congelante");
		
		System.out.println("Seção de Livros:\n");
		livro01.imprimirDetalhes();
		System.out.println("Preço: R$"+livro01.calcularPreco());
		livro02.imprimirDetalhes();
		System.out.println("Preço: R$"+livro02.calcularPreco());
		System.out.println("\nSeção de DVD's:\n");
		dvd01.imprimirDetalhes();
		System.out.println("Preço: R$"+dvd01.calcularPreco());
		dvd02.imprimirDetalhes();
		System.out.println("Preço: R$"+dvd02.calcularPreco());
	
	}
}