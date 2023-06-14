package Questão01;

public class LivroInfantil implements Livro{
	@Override
    public void exibirDetalhes() {	
		System.out.println("Livro Infantil:");
		System.out.println("Título - O Pequeno Príncipe");
		System.out.println("Autor - Antonie de Saint-Exupéry");
		System.out.println("Ano De Publicação - 2015");
		System.out.println("Editora - Via Leitura");
	}

}
