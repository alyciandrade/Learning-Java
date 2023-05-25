package Questão01;

public class Livro {
	
	static int totalLivros = 0;
	static int livrosEmprestados = 0;
	
	static void adicionarLivros(int addLivros) {
		 totalLivros += addLivros;
	}
	
	static void emprestarLivro(int qntlivrosEmprestados) {
		if(qntlivrosEmprestados <= totalLivros){
		   
			livrosEmprestados += qntlivrosEmprestados;
		   totalLivros -= qntlivrosEmprestados;
		   
		   System.out.println("\nEmprestado com sucesso!!!\n");
		   
		}else {
			System.out.println("\nERRO!\n");
		}
	}
	
	static void devolverLivro(int livrosDevolvidos){
		if(livrosDevolvidos <= livrosEmprestados) {
			livrosEmprestados -= livrosDevolvidos;
			totalLivros += livrosDevolvidos;
			
		System.out.println("\nDevolvido com sucesso!!!\n");
			
		}else {
			System.out.println("\nERRO!\n");
		}
	}

}
