package Questão01;

class Gerente extends Funcionario{
	
	public Gerente(double salario) {
		super(salario);
	}
	
	@Override
	public double calcularSalario() {
		double bonus = salario * 0.2;
		
		return salario + bonus;
	}

}