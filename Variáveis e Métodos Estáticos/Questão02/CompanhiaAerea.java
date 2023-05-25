package Questão02;

import java.util.*;

public class CompanhiaAerea extends Aviao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		
		do {
		System.out.println("Digite:");
		System.out.println("1 - Adicionar Avião.");
		System.out.println("2 - Visualizar média de passageiros por voo.");
		System.out.println("3 - Visualizar quantidade de aviões em serviço.");
		System.out.println("4 - Fechar menu.");
		
		num1 = input.nextInt();

		switch(num1) {
		
		case 1: 
			int num2;
			System.out.println("\nDigite a quantidade de passageiros neste voo:");
			num2 = input.nextInt();
			System.out.println("\n");
			
			Aviao.adicionarAviao(num2);
			
			break;
			
		case 2:
			System.out.println("\nMédia de passageiros por voo: "+Aviao.calcularMediaPassageiros());
			System.out.println("\n");
			
			break;
			
		case 3:
			System.out.println("\nQuantidade de aviões em serviço: "+Aviao.quantidadeAvioes);
			System.out.println("\n");
			
			break;
		}
		
		}while(num1 != 4);
	}

}
