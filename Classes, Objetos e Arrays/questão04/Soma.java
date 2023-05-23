//Escreva um programa em Java que leia um valor inteiro do usuário que será o tamanho de um 
//vetor de números inteiros. Em seguida, o programa deve ler os valores do vetor e exibir a soma 
//dos elementos do vetor.

package questão04;

import java.util.*;

public class Soma {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int soma = 0;
		
		System.out.print("Digite o tamanho do vetor: ");
		int tam = input.nextInt();
		
		int vet[] = new int[tam];
		for(int i = 0; i < vet.length; i++)
		{
			System.out.println("Digite o número da posição "+i+": ");
			vet[i] = input.nextInt();
		}
		
		for(int i = 0; i < vet.length; i++)
		{
			soma += vet[i];
		}
		
		System.out.println("\nA soma dos números do vetor é: "+soma);
		
				

	}

}
