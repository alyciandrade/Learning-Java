//Escreva um programa em Java que crie uma matriz de inteiros de tamanho 3x3 e preencha com 
//valores fornecidos pelo usuário. Em seguida, exiba a matriz e a soma dos elementos da diagonal 
//principal (que é composta pelos elementos da posição i, j onde i é igual a j).

package questão05;

import java.util.*;

public class Matriz {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num[][] = new int [3][3];
		int soma = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
			System.out.println("Digite um número: ");
			num[i][j] = input.nextInt();
			
			soma = num[0][0]+num[1][1]+num[2][2];
			}
		}	
		
		System.out.println("\nMatriz");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(num[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		System.out.println("\nSoma dos números da diagonal principal: "+soma);
	}

}
