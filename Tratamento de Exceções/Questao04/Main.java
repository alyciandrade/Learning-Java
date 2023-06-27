package Questao04;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
			
		try {
			System.out.println("Digite o nome do usuário:");
			String usuario = input.nextLine();
			
			System.out.println("Digite a senha:");
			String senha = input.nextLine();
			
			AcessoNegadoException.verificarAcesso(usuario, senha);
			
		}catch(AcessoNegadoException e) {
			System.out.println("ERRO!" +e.getMessage());
		}
				
	}

}
