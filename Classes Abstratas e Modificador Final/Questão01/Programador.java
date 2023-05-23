package Questão01;

public class Programador extends Funcionario{
	
	public Programador(double salario) {
		super(salario);
	}
	
	@Override
	public double calcularSalario() {
		double bonus = salario * 0.1;
		
		return salario + bonus;
	}
}