package Questão01;

public class Biografia implements Livro {
	
	@Override
    public void exibirDetalhes() {
		System.out.println("Livro Biográfico:");
		System.out.println("Título - Frida, A Biografia");
		System.out.println("Autor - Hayden Herrera");
		System.out.println("Ano De Publicação - 2011");
		System.out.println("Editora - Azul");
	}

}
