package Questao01;
import java.util.*;

enum DiasSemana{
	SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO, DOMINGO
}

public class q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dia;
		
		System.out.println("Digite um número de 1 a 7 para obter um dia da semana:");
		dia = input.nextInt();
		
		if(dia <= 7 && dia >= 1) {
			DiasSemana diaSelecionado = DiasSemana.values()[dia - 1];
			System.out.println("O dia selecionado é: "+diaSelecionado);
			
			if(diaSelecionado == DiasSemana.SÁBADO || diaSelecionado == DiasSemana.DOMINGO) {
				System.out.println("Dia NÃO útil");
			}else {
				System.out.println("Dia útil");
			}
		}else {
			System.out.println("Número de dia inválido");
		}
		
	
	}

}
