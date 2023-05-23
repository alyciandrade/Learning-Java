package Questão02;

public class Arqueiro extends Personagem {

	public Arqueiro (String nome, int nivel, int experiencia){
		super(nome, nivel, experiencia, 70, 60, 70, 100);
	}
	
	@Override
	public void atacar() {
		System.out.println("Ataque à Distância");
	}
	
	public void fugir() {
		System.out.println("*Fuga*");
	}
}
