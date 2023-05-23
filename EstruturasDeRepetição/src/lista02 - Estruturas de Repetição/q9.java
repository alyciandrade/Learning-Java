/*QUESTÃO 9 - Escreva um programa que solicite ao usuário a digitação de um número inteiro, e que verifique se 
este número é um quadrado perfeito. Se for, exiba na tela a mensagem "O número X é um 
quadrado perfeito". Caso contrário, exiba a mensagem "O número X não é um quadrado perfeito", 
onde X é o número digitado pelo usuário. O programa deve para quando um número quadrado 
perfeito for digitado.*/

package lista02;

import java.util.*;

public class q9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, i = 1;
		boolean QuadPerfeito = false;
		
		System.out.print("Digite um número inteiro: ");
		num = input.nextInt();
		
		do {
			
			if(i * i == num) {
				QuadPerfeito = true;
				break;
			}
			i++;
			
		}while(i <= num/2);
		
		if(QuadPerfeito)
		{
			System.out.println("O número "+num+" é um quadrado perfeito!");
		}else
			System.out.println("O número "+num+" não é um quadrado perfeito!");
				
	}

}
