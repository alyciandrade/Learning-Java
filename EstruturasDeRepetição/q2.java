/*QUESTÃO 2 - Escreva um programa que calcule a média aritmética de 10 números inteiros informados pelo 
usuário*/

package lista02;

import java.util.*;

public class q2 {

	public static void main(String[] args) {
		Scanner resultado = new Scanner(System.in);
		
		int soma = 0;
		int num;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite o " +i+ "° número:");
			num = resultado.nextInt();
			
			soma += num;
			
		}
		
	    double media = soma / 10.0;
		
		System.out.println("A média aritmética dos dez número digitados é: " + media);
		
	}

}
