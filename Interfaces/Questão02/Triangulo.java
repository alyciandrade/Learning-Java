package Questão02;

public class Triangulo implements FormaGeometrica {
	
	private double base;
	private double altura;
	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo() {
		this.base = 6;
		this.altura = 6.5;
		this.lado1 = 5;
		this.lado2 = 8;
		this.lado3 = 4;
	}

	@Override
	public double calcularArea() {
		double AT = (base * altura) / 2;
		System.out.println("Área do Triângulo: "+AT);
		
		return 0;
	}

	@Override
	public double calcularPerimetro() {
		double PT = lado1 + lado2+ lado3;
		System.out.println("Perímetro do Triângulo: "+PT);
		
		return 0;
	}

}

