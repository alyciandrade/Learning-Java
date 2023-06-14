package Questão01;

public class Main {

	public static void main(String[] args) {
		Livro romance = new Romance();
		Livro biografia = new Biografia();	
		Livro infantil = new LivroInfantil();
	
		Livro[] livros = new Livro[3];
        livros[0] = romance;
        livros[1] = biografia;
        livros[2] = infantil;

        for (Livro livro : livros) {
            livro.exibirDetalhes();
            System.out.println("\n");
        }
	}

}
