package Questão01;

import java.util.*;

public class Conta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		
		ContaPoupança cliente01 = new ContaPoupança(); 
		cliente01.setCliente("Alycia Alves Andrade");
		cliente01.setNumConta(40028922);
		cliente01.setSaldo(1000);
		cliente01.setDiaDeRendimento(30);
		
		ContaEspecial cliente02 = new ContaEspecial();
		cliente02.setCliente("Kali Uchis");
		cliente02.setNumConta(17052000);
		cliente02.setSaldo(1500);
		cliente02.setLimite(2000);
		
		do {
		System.out.println("Digite: ");
		System.out.println("1 - Sacar Dinheiro.");
		System.out.println("2 - Depositar Dinheiro.");
		System.out.println("3 - Consultar Dados.");
		System.out.println("4 - Sair do Menu.");
		
		num1 = input.nextInt();
		
		
		switch(num1) {
		
		case 1: System.out.println("\nInsira o número da conta: ");
		int numConta1 = input.nextInt();
		System.out.println("\n");
		
		if(numConta1 == 40028922) {
			System.out.println("------- CONTA POUPANÇA -------");
			System.out.println("Nome: "+cliente01.getCliente());
        	System.out.println("Saldo Disponível: R$" +cliente01.calcularNovoSaldo(0.5));
        	System.out.println("Taxa de Rendimento de 1 mês: R$"+cliente01.getDiaDeRendimento() * 0.5);
        	System.out.println("\nDigite o valor do saque: ");
        	double saque = input.nextDouble();
        	System.out.println("\nSaque Concluído!\n");
        	cliente01.sacar(saque);
        	
		}else if(numConta1 == 17052000) {
			System.out.println("------- CONTA ESPECIAL -------");
			System.out.println("Nome: "+cliente02.getCliente());
        	System.out.println("Saldo Disponível: R$" +cliente02.getSaldo());
        	System.out.println("Limite Disponível: R$" +cliente02.getLimite());
        	System.out.println("\nDigite o valor do saque: ");
        	double saque = input.nextDouble();
        	System.out.println("\nSaque Concluído!\n");
        	cliente02.sacar(saque);
			
		}else {
        	System.out.println("Conta não identificada!\n");
        }
        	break;
			 		   
		case 2: System.out.println("\nInsira o número da conta: ");
		int numConta2 = input.nextInt();
		System.out.println("\n");
		
		if(numConta2 == 40028922) {
			System.out.println("------- CONTA POUPANÇA -------");
			System.out.println("Nome: "+cliente01.getCliente());
        	System.out.println("Saldo Disponível: R$" +cliente01.calcularNovoSaldo(0.5));
        	System.out.println("Taxa de Rendimento de 1 mês: R$"+cliente01.getDiaDeRendimento() * 0.5);
        	System.out.println("\nDigite o valor do depósito: ");
        	double deposito = input.nextDouble();
        	System.out.println("\nDepósito Concluído!\n");
        	cliente01.depositar(deposito);
        	
		}else if(numConta2 == 17052000) {
			System.out.println("------- CONTA ESPECIAL -------");
			System.out.println("Nome: "+cliente02.getCliente());
        	System.out.println("Saldo Disponível: R$" +cliente02.getSaldo());
        	System.out.println("Limite Disponível: R$" +cliente02.getLimite());
        	System.out.println("\nDigite o valor do depósito: ");
        	double deposito = input.nextDouble();
        	System.out.println("\nDepósito Concluído!\n");
        	cliente02.depositar(deposito);
        	if(cliente02.saldo >= 0) {
        		cliente02.setLimite(2000);
        	}
			
		}else {
        	System.out.println("Conta não identificada!\n");
        }
        	break;	 
        	
		case 3: 
			System.out.println("\nInsira o número da conta: ");
			int numConta3 = input.nextInt();
			System.out.println("\n");
			
			if(numConta3 == 40028922) {
				System.out.println("------- CONTA POUPANÇA -------");
				System.out.println("Nome: "+cliente01.getCliente());
				System.out.println("Saldo Disponível: R$" +cliente01.calcularNovoSaldo(0.5));
				System.out.println("Taxa de Rendimento de 1 mês: R$"+cliente01.getDiaDeRendimento() * 0.5);
	        	System.out.println("\n");
	        	
			}else if(numConta3 == 17052000) {
				System.out.println("------- CONTA ESPECIAL -------");
				System.out.println("Nome: "+cliente02.getCliente());
	        	System.out.println("Saldo Disponível: R$" +cliente02.getSaldo());
	        	System.out.println("Limite Disponível: R$" +cliente02.getLimite());
	        	System.out.println("\n");
				
			}else {
	        	System.out.println("Conta não identificada!\n");
	        }
	        	break;
		
		}
		
		}while(num1 != 4);

	}

}
