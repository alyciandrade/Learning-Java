/*QUESTÃO 7 - Escreva um programa que solicite ao usuário a digitação de uma senha. O programa deve repetir 
a solicitação até que o usuário acerte a senha, exibindo na tela a mensagem "Senha correta!".*/

package lista02;

import java.util.*;

public class q7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int senha = 12345, num;
		
		do {
			
			System.out.print("Digite a senha: ");
			num = input.nextInt();
			
			if(num != senha) {

			System.out.println("Senha Incorreta!");
		
			}else
				System.out.println("Senha Correta!");
			
		}while(num != senha);

	}

}
