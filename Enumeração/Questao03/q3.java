package Questao03;
import java.util.*;

enum Jogos{
	 AVENTURA("Aventura", 5, "Xbox, PlayStation"), 
	 ESTRATEGIA("Estrategia", 3, "Xbox, PC"), 
	 RPG("RPG", 2, "Xbox, PC"), 
	 CORRIDA("Corrida", 4, "Xbox, PlayStation, PC"), 
	 FPS("FPS", 4, "Xbox, PC");

	 
	 private final String nome;
	 private final int MaxJogadores;
	 private final String plataforma;

	 
	 Jogos(String nome, int MaxJogadores, String plataforma){
		 this.nome = nome;
		 this.MaxJogadores = MaxJogadores;
		 this.plataforma = plataforma;
		 }
	
     public String getNome() {
    	 return nome;
     }
		 
	 public int getMaxJogadores() {
		return MaxJogadores;
	}

	public String getPlataforma() {
		return plataforma;
	}
	 
}

public class q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cont = 1;
		String categoria;
		
		System.out.println("Opções disponíveis: ");
		
		for(Jogos jogo : Jogos.values()) {
			System.out.println(cont+"° - " +jogo.getNome());
			cont++;
		}
		
		System.out.println("\nDigite o nome da categoria desejada: ");
		categoria = input.nextLine();
		
		Jogos categoriaJogo = Jogos.valueOf(categoria.toUpperCase());
		System.out.println("Nome: "+categoriaJogo.getNome());
		System.out.println("Número Máximo de Jogadores: "+categoriaJogo.getMaxJogadores());
		System.out.println("Plataforma(s) Suportada(s): "+categoriaJogo.getPlataforma());
		

	}

}
