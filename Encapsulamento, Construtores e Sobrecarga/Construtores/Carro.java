//QUESTÃO 6 - Crie uma classe “Carro” com quatro atributos privados, “marca”, “modelo”, “ano” e “cor”, todos 
//do tipo String. Implemente um construtor que receba os quatro argumentos e inicialize os 
//atributos, e outro construtor que receba apenas a “marca” e o “modelo”, e inicialize o “ano” como 
//0 e a “cor” como "preta". Crie a classe principal para exibir os valores dos atributos

package Construtores;

import java.util.Scanner;

public class Carro {
	
	private String marca;
	private String modelo;
	private String ano;
	private String cor;
	
	public Carro(){
		
	this.marca = "Toyota";
	this.modelo = "Corolla";
	this.ano = "2023";
	this.cor = "cinza";
	}
	
	public Carro(String ano, String cor) {
		this.ano = "0";
		this.cor = "preto";
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAno() {
		return ano;
	}

	public String getCor() {
		return cor;
	}

	public void setMarca(String marca) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a MARCA do carro: ");
		this.marca = input.nextLine();
	}

	public void setModelo(String modelo) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o MODELO do carro: ");
		this.modelo = input.nextLine();
	}
	
	
	

}
