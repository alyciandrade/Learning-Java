package Questão02;

public class Mago extends Personagem {
	
	public Mago (String nome, int nivel, int experiencia){
		super(nome, nivel, experiencia, 80, 70, 100, 50);
	}
	
	@Override
	public void atacar() {
		System.out.println("Ataque à Distância");
	}
	
	public void curar() {
		System.out.println("*Cura*");
	}

}
