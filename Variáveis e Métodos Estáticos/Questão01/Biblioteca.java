package Questão01;

import java.util.*;

public class Biblioteca extends Livro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		
		do {
		System.out.println("Digite:");
		System.out.println("1 - Adicionar livros ao estoque.");
		System.out.println("2 - Emprestar livros.");
		System.out.println("3 - Devolver livros.");
		System.out.println("4 - Visualizar 'Total de Livros' e 'Livros Emprestados'.");
		System.out.println("5 - Fechar menu.");
		
		num1 = input.nextInt();
		
		
		
		switch(num1) {
		
		case 1: 
			int num2;
			System.out.println("\nDigite a quantidade de livros que deseja ADICIONAR AO ESTOQUE:");
		    num2 = input.nextInt();
		    
		    System.out.println("\nAdicionado com sucesso!!!\n");
		    
		    Livro.adicionarLivros(num2);
		    
		    break;
		    
		case 2:
			int num3;
			System.out.println("\nDigite a quantidade de livros a ser EMPRESTADO:");
			num3 = input.nextInt();
			
			Livro.emprestarLivro(num3);
			
			break;
			
		case 3:
			int num4;
			System.out.println("\nDigite a quantidade de livros que será DEVOLVIDOS:");
			num4 = input.nextInt();
			
			Livro.devolverLivro(num4);
			
			break;
			
		case 4: 
			System.out.println("\nTotal de Livros: " +Livro.totalLivros);
			System.out.println("Livros Emprestados: " +Livro.livrosEmprestados);
			System.out.println("\n");
			
			break;
		}
		
	  }while(num1 != 5);
		
	}

}
