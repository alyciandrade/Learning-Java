package Questão02;

public class Retangulo implements FormaGeometrica {
	
	    private double base;
	    private double altura;

	    public Retangulo() {
	        this.base = 5.2;
	        this.altura = 7.5;
	    }
	
	@Override
	public double calcularArea() {
		double AR = base * altura;
		System.out.println("Area do Retângulo: "+AR);
		
		return 0;
	}
	
	@Override
	public double calcularPerimetro() {	
		double PR = 2 * (base + altura);	
		System.out.println("Perímetro do Retângulo: "+PR);
		
		return 0;
	}

}
