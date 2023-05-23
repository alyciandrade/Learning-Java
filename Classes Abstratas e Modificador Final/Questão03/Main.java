package Questão03;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		SistemaDePagamento pagamento = new SistemaDePagamento();
		
		double valor;
		
		System.out.println("Digite o valor da transação:");
		System.out.print("R$: ");
		valor = input.nextDouble();
		
		System.out.println("\nJuros R$:"+pagamento.calcularJuros(valor));
		System.out.println("Valor Final R$:"+pagamento.calcularValorTotal(valor));
		
	}

}
