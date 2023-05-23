//QUESTÃO 1

package lista01;

import java.util.*;

public class q1 {

	public static void main(String[] args) {
		Scanner resposta = new Scanner(System.in);

		int numero;

		System.out.print("Digite um número inteiro: ");
		numero = resposta.nextInt();
		
		if(numero > 0){
			System.out.println("O número "+numero+ " é POSITIVO!");
		}
		else if(numero == 0) {
			System.out.println("O número digitado é igual a ZERO!");
		}
		else {
			System.out.println("O número "+numero+" é NEGATIVO!");
			
		}

  	}

}
