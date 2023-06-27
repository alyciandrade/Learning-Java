package Questão01;

public class Banco {

	private double saldo;

	public Banco(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double saque) {
		
			if (saque > saldo) {
				throw new IllegalArgumentException("\nSaldo Insuficiente!\nSaque NÃO realizado.");
			}
			
			saldo -= saque;
			System.out.println("Saque realizado com sucesso!");
			System.out.println("Novo saldo: " + saldo);
		
	}

}
