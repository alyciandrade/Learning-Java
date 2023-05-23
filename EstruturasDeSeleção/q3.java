//QUESTÃO 3

package lista01;

import java.util.*;

public class q3 {

	public static void main(String[] args) {
		Scanner resposta = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite um número inteiro: ");
		n1 = resposta.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = resposta.nextInt();
		
		if(n1 > n2) {
			System.out.println("O número "+n1+" é MAIOR que o número "+n2);
		}
		else if (n1 == n2) {
			System.out.println("Os número são IGUAIS!");
		}
		else 
			System.out.println("O número "+n2+" é MAIOR que o número "+n1);
	}

}
