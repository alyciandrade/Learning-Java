/*QUESTÃO 6 - Escreva um programa que solicite ao usuário a digitação de um número inteiro, e que verifique se 
este número é um número primo. Se for, exiba na tela a mensagem "O número X é primo". Caso 
contrário, exiba a mensagem "O número X não é primo", onde X é o número digitado pelo usuário.
O programa deve parar quando um número primo for digitado.*/

package lista02;

import java.util.*;

public class q6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Digite um número inteiro: ");
		int num = input.nextInt();
		
		int divisor = 2;
		boolean NumPrimo = true;

        while (divisor < num) {
    		
            if (num % divisor == 0) {
                NumPrimo = false;
                break;
            }
            divisor++;
            
        }
        if(NumPrimo) {
        	
        	System.out.println("O número "+num+" é primo!");
    	
        }else
        	System.out.println("O número "+num+" não é primo!");

	}

}
