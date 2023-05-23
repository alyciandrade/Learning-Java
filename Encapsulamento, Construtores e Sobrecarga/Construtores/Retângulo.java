//QUESTÃO 5 - Crie uma classe “Retangulo” com dois atributos privados, “base” e “altura”, ambos do tipo 
//double. Implemente dois construtores para a classe: um que não recebe argumentos e inicializa 
//os atributos com os valores 0.0, e outro que recebe dois argumentos do tipo double e inicializa os 
//atributos com estes valores. Crie a classe principal para exibir o tamanho do retângulo.

package Construtores;

public class Retângulo {
	
	private double base;
	private double altura;
	
	public Retângulo() {
		this.base = 0.0;
		this.altura = 0.0;
	}
	
	public Retângulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}
	
	

}

