package Questão01;

public abstract class ContaBancaria {
	
	private String cliente;
	private int numConta;
	protected double saldo;

public double sacar(double saque) {
	if(saque <= this.saldo) {
		this.saldo -= saque;
		
	}else {
		System.out.println("Saldo não disponível!");
	}
	return saldo;
}

public double depositar(double deposito) {
	
	return saldo += deposito;
	
  }

public String getCliente() {
	return cliente;
}

public int getNumConta() {
	return numConta;
}

public double getSaldo() {
	return saldo;
}

public void setCliente(String cliente) {
	this.cliente = cliente;
}

public void setNumConta(int numConta) {
	this.numConta = numConta;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

}
