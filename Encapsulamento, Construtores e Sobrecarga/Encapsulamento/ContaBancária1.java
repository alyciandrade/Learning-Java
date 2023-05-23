//QUESTÃO 3 - Crie uma classe "ContaBancaria" que possua os atributos "saldo" e "limite" e os métodos 
//"getSaldo", "getLimite", "depositar" e "sacar". Implemente o encapsulamento dos atributos e 
//utilize-o nos métodos para garantir que o saldo não fique negativo

package Encapsulamento;

import java.util.*;

public class ContaBancária1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ContaBancária conta = new ContaBancária(500, 1000);
		int num;
		double valor;
		
		do {
		System.out.println("Digite: ");
		System.out.println("1 - Consultar Saldo.");
		System.out.println("2 - Consultar Limite.");
		System.out.println("3 - Fazer Depósito.");
		System.out.println("4 - Sacar Dinheiro.");
		System.out.println("5 - Sair.");
		num = input.nextInt();
		
		switch(num){
		
		case 1: 
			System.out.println("R$" +conta.getSaldo());
			break;
		case 2: 
			System.out.println("R$" +conta.getLimite());
			break;
		case 3: 
			System.out.println("Digite o valor a ser depositado: ");
			 valor = input.nextDouble();
			System.out.println("R$:" +conta.depositar(valor));		
			break;
		case 4:
			System.out.println("Digite o valor a ser sacado: ");
			valor = input.nextDouble();
			conta.sacar(valor);
			break;
			
				
		}
		
	  }while(num != 5);
		
		
	}

}
