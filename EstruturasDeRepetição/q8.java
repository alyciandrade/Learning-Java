/*QUESTÃ 8 - Escreva um programa que solicite ao usuário a digitação de um número inteiro N, e que calcule e 
exiba na tela a soma de todos os números de 1 a N.*/

package lista02;

import java.util.*;

public class q8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, soma = 0, i = 1;
		
		do {
		
			System.out.print("Digite um número inteiro maior que zero:");
		    num = input.nextInt();
				
		}while(num <= 0);
		
		do {
			
			soma += i;
			i++;
			
		}while(i <= num);
		
		System.out.println("A soma de todos os números, de 1 a "+num+", é: "+soma);

	}

}
