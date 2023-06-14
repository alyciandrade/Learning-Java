package Questão01;

public class Romance implements Livro{
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Livro de Romance:");
		System.out.println("Título - De Lukov, Com Amor");
		System.out.println("Autor - Mariana Zapata");
		System.out.println("Ano De Publicação - 2020");
		System.out.println("Editora - Charme");
		
	}

}
