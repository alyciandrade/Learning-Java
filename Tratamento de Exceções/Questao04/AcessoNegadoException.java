package Questao04;

public class AcessoNegadoException extends Exception {

	public AcessoNegadoException() {
		super("\nAcesso Negado.");
	}
	
	public static void verificarAcesso(String usuario, String senha) throws AcessoNegadoException {
		
			if(!usuario.equals("admin") || !senha.equals("12345")){
		        throw new AcessoNegadoException();
			}
			System.out.println("Acesso Permitido. Bem-vindo");

	}
	
}
