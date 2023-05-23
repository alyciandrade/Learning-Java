package questão01;

import java.util.*;

public class Viagem {

	public String origem;
	public String destino;
	public String[] locais_de_parada;
	
	public void setOrigem() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o local de origem: ");
		this.origem = input.nextLine();
	}
	public void setDestino() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o destino: ");
		this.destino = input.nextLine();
		
	}
	public void setLocais_de_parada() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de paradas que será feita: ");
		int num_paradas = input.nextInt();
		
		input.nextLine();
		
		this.locais_de_parada = new String[num_paradas];
		for(int i = 0; i < num_paradas; i++)
		{
			System.out.println("Digite o nome da "+(i+1)+"° parada: ");
			this.locais_de_parada[i] = input.nextLine();		
		}
		
	}
	
	public void mostrar() {
		System.out.println("Origem: "+this.origem);
		System.out.println("Destino: "+this.destino);
		System.out.println("Locais de Parada: ");
		for (String parada : this.locais_de_parada) {
            System.out.println("- " + parada);
	}
	
}
}