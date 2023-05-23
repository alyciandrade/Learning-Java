//QUESTÃO 3 - Crie uma classe "ContaBancaria" que possua os atributos "saldo" e "limite" e os métodos 
//"getSaldo", "getLimite", "depositar" e "sacar". Implemente o encapsulamento dos atributos e 
//utilize-o nos métodos para garantir que o saldo não fique negativo

package Encapsulamento;

public class ContaBancária {
	
	private double saldo;
	private double limite;
	
	public ContaBancária(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public double depositar(double dinheiro) {
		return saldo += dinheiro;
		
	}
	
	public double sacar(double dinheiro) {
		if(dinheiro <= saldo + limite) {
			saldo -= dinheiro;
		System.out.println("Total na conta R$:"+saldo);
			return 0;
		}else { 
		   System.out.println("Valor indisponível para saque!");
		return 0;
		}
		
		
	}

}
