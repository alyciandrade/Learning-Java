//QUESTÃO 4 - Em uma classe "Cliente", crie um atributo "nomeCompleto" e um método "setNomeCompleto". 
//Utilize o encapsulamento para garantir que o nome não ultrapasse 80 caracteres (sem espaços).

package Encapsulamento;

public class Cliente {
	
	private String nomeCompleto;
	
	public void setNomeCompleto(String nomeCompleto) {
		if(nomeCompleto.replace("\\s+","").length() > 80) {
			System.out.println("O nome não pode ultrapassar 80 caracteres!");
		}else {
			this.nomeCompleto = nomeCompleto;
		}
	}

}


