package Questao03;

import java.util.*;

public class Solicitacao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num01, num02;
		
		try {
			
			System.out.println("Digite o 1° número:");
			num01 = input.nextInt();
			System.out.println("Digite o 2° número:");
			num02 = input.nextInt();
			
			int resultado = num01 / num02;
			System.out.println("Resultado da divisão de "+num01+" por "+num02+" é: "+resultado);
			
		}catch(ArithmeticException e) {
			System.out.println("ERRO! Divisão por 0");
		}
		catch(InputMismatchException ex){
			System.out.println("ERRO! Entrada Inválida.");
		}
	}
}
