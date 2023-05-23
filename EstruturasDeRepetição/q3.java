/* QUESTÃO 3 - Escreva um programa que solicite ao usuário a quantidade de alunos em uma turma, e em seguida 
peça as notas desses alunos. Ao final, o programa deve calcular e exibir a média da turma.*/

package lista02;

import java.util.*;

public class q3 {

	public static void main(String[] args) {
		Scanner resultado = new Scanner(System.in);
		
		
		System.out.print("Insira a quantidade de alunos na turma: ");
		int qtalunos = resultado.nextInt();
		
		double soma = 0;
		
		for(int i = 1; i <= qtalunos; i++)
		{
			System.out.println("Digite a nota do "+i+"° aluno: ");
			double nota = resultado.nextDouble();
			
			soma += nota;
		}
		
		double media = soma / qtalunos;
		
	    System.out.println("A média artimética da turma é: " +media);	    
	   		
	}

}
