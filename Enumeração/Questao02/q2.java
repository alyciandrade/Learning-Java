package Questao02;
import java.util.*;

enum Planetas{
	
	MERCURIO(0.38), 
	VENUS(0.91),
	TERRA(1.00), 
	MARTE(0.38), 
	JUPITER(2.53),
	SATURNO(1.07), 
	URANO(0.92),
	NETUNO(1.19);
	
	private final double gravidade;
	
	Planetas(double gravidade){
		this.gravidade = gravidade;
	}
	
	public double getGravidade() {
        return gravidade;
     }
}

public class q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 8 para obter o nome de um planeta: ");
		int planeta = input.nextInt();
		
		if(planeta <= 8 && planeta >= 1) {
			
			Planetas planetaSelecionado = Planetas.values()[planeta - 1];
			System.out.println("O planeta selecionado é: "+planetaSelecionado);
			System.out.println("Gravidade: "+planetaSelecionado.getGravidade());
			
		}else {
			System.out.println("Número de planeta inválido!");
		}

	}

}
