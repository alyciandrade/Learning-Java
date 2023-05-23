package Questão01;

public class Main {

	public static void main(String[] args) {
		Gerente gerente = new Gerente(6500);
		Programador programador = new Programador(4700);
		
		System.out.println("Salário do Gerente: R$"+gerente.calcularSalario());
		System.out.println("Salário do Programador: R$"+programador.calcularSalario());
	}
}