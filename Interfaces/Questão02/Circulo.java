package Questão02;

public class Circulo implements FormaGeometrica {

	private double raio;
	public final static double pi = 3.14;

	public Circulo() {
		this.raio = 4.3;
	}

	@Override
	public double calcularArea() {
		double AC = pi * raio * raio;
		System.out.println("Área do Círculo: "+AC);
		
		return 0;
	}

	@Override
	public double calcularPerimetro() {
		double PC = 2 * pi * raio;
		System.out.println("Perímetro do Círculo: "+PC);
		
		return 0;
	}

}
