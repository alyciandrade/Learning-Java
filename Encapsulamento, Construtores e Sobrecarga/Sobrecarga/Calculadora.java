//QUESTÃO 7 - Crie uma classe “Calculadora” com dois métodos sobrecarregados chamados “somar”. O 
//primeiro método deve receber dois argumentos inteiros e retornar a soma deles, enquanto o 
//segundo método deve receber dois argumentos double e retornar a soma deles. Crie a classe 
//principal para testar a execução dos métodos.

package Sobrecarga;

public class Calculadora {
	
	public int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	public double somar(double num1, double num2) {
		return num1 + num2;
	}

}
