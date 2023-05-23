/* QUESTÃO 4 - Escreva um programa que solicite ao usuário a digitação de um número inteiro. O programa deve 
exibir na tela a tabuada deste número*/

package lista02;

import java.util.*;

public class q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = input.nextInt();
		
		while (num >= 0){
			
			for(int i = 0; i <= 10; i++)
			{
				int resposta = i * num; 
				System.out.println(i +" * " + num + " = " + resposta);
			}
			break;
			
		}
         
	}

}
