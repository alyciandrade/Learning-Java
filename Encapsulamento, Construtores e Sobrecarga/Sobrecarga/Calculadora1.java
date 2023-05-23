//QUESTÃO 7

package Sobrecarga;

public class Calculadora1 {

	public static void main(String[] args) {
		Calculadora conta = new Calculadora();
		
		int resposta1 = conta.somar(5, 2);
		System.out.println(resposta1);
		
		double resposta2 = conta.somar(3.5, 5.1);
		System.out.println(resposta2);

	}

}
