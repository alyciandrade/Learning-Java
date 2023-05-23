/*Escreva um programa Java que leia o nome de um mês e imprima o número correspondente a 
esse mês. Por exemplo, se o usuário digitar "janeiro", o programa deve imprimir "1". Se o 
usuário digitar "dezembro", o programa deve imprimir "12". Se o usuário digitar um nome 
inválido, o programa deve imprimir uma mensagem de erro.*/

package lista01;

import java.util.*;

public class q5 {

	public static void main(String[] args) {
		Scanner resposta = new Scanner(System.in);
		
		String mes; 
		
		System.out.println("Digite o nome de um mês: ");
		mes = resposta.nextLine(); 
		
		switch(mes) {
		
		case "janeiro":
			System.out.println("1");
			break;
		case "fevereiro":
			System.out.println("2");
			break;
		case "março":
			System.out.println("3");
			break;
		case "abril":
			System.out.println("4");
			break;
		case "maio":
			System.out.println("5");
			break;
		case "junho":
			System.out.println("6");
			break;
		case "julho":
			System.out.println("7");
			break;
		case "agosto":
			System.out.println("8");
			break;
		case "setembro":
			System.out.println("9");
			break;
		case "outubro":
			System.out.println("10");
			break;
		case "novembro":
			System.out.println("11");
			break;
		case "dezembro":
			System.out.println("12");
			break;
		default:
			System.out.println("mês inválido!");
			
		}
		
	}

}
