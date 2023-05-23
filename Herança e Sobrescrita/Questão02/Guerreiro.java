package Questão02;

public class Guerreiro extends Personagem {
	
	public Guerreiro (String nome, int nivel, int experiencia){
		super(nome, nivel, experiencia, 100, 90, 40, 55);
	}
	
	@Override
	public void atacar() {
		System.out.println("Ataque Corpo-a-Corpo");
	}


}
