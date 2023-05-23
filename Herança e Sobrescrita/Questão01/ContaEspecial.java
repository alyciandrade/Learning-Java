package Questão01;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;
	
	@Override
	public double sacar(double saque) {
		if(saque <= this.saldo) {
			this.saldo -= saque;
		}
		else if(saque <= this.saldo + limite) {
			double valor = this.saldo -= saque;
			this.limite += valor;
		}
		else {
			System.out.println("Saldo não disponível!");
		}	
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
