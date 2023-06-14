package Questão02;

public class Main {

	public static void main(String[] args) {
		FormaGeometrica retangulo = new Retangulo();
		FormaGeometrica circulo = new Circulo();
		FormaGeometrica triangulo = new Triangulo();
		
		FormaGeometrica[] formas = new FormaGeometrica[3]; 
		formas[0] = retangulo;
		formas[1] = circulo;
		formas[2] = triangulo;
		
		for(FormaGeometrica forma : formas)
		{
			forma.calcularArea();
			forma.calcularPerimetro();
			System.out.println("\n");
		}
	}

}
