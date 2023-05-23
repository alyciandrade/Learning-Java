package Questão01;

 abstract class Funcionario {
	 
	 protected double salario;
	
	public Funcionario(double salario) {
           this.salario = salario;
	}
	
	public abstract double calcularSalario();

}