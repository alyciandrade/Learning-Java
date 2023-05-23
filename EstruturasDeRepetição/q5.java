/* QUESTÃO 5 - Escreva um programa que solicite ao usuário a digitação de vários números inteiros, e que pare 
de pedir novos números quando o usuário digitar o número zero. Ao final, o programa deve exibir 
a soma dos números digitados*/

package lista02;

import java.util.*;

public class q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int cont = 0, resposta;
		boolean num = true;
		
		
		while(num) {
			
			System.out.print("Digite um número inteiro: ");
			resposta = input.nextInt();
			
			if(resposta == 0) {
				num = false;
	           break;
			}			
		    cont += resposta;					
		}
		
		System.out.println("A soma de todos os números digitados é: "+cont);

	}

}
