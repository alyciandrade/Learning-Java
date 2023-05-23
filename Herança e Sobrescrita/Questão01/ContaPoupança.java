package Questão01;

import java.util.*;

public class ContaPoupança extends ContaBancaria{
	
	private int diaDeRendimento;
	
	
public double calcularNovoSaldo(double taxaDeRendimento) {	
	
	return saldo + (taxaDeRendimento * diaDeRendimento);
	
}

public int getDiaDeRendimento() {
	return diaDeRendimento;
}

public void setDiaDeRendimento(int diaDeRendimento) {
	this.diaDeRendimento = diaDeRendimento;
}

}
