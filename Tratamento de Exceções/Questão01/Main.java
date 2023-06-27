package Questão01;

public class Main {

	public static void main(String[] args) {
		Banco saque = new Banco(2000);

		try {
			
		saque.sacar(3000);
		
		}catch(IllegalArgumentException e) {
			System.out.println("ERRO!" + e.getMessage());
		}
	}
}
