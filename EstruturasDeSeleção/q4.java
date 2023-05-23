//QUESTÃO 4

package lista01;

import java.util.*;

public class q4 {

	public static void main(String[] args) {
		Scanner resposta = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número inteiro: ");
		
		numero = resposta.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número "+numero+" é PAR!");
		}
		else
			System.out.println("O número "+numero+" é ÍMPAR!");
		
		
	}

}
