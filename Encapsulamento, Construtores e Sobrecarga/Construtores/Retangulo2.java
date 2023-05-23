package Construtores;

import java.util.*;

public class Retangulo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Retângulo tamanho = new Retângulo();
		
		System.out.println("Digite o valor da BASE: ");
		double base = input.nextDouble();
		System.out.println("Digite o valor da ALTURA: ");
		double altura = input.nextDouble();
		
		System.out.println("\nO tamanho do retângulo é: " +base * altura);

	}

}
