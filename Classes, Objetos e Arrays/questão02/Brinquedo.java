package questão02;

import java.util.*;

public class Brinquedo {
	
	public String nome;
	public String faixaEtaria;
	public double preço;
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(){
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o nome do brinquedo: ");
		this.nome = input.nextLine();
	}
	public String getFaixaEtaria(){
		return this.faixaEtaria;
	}
	public void setFaixaEtaria(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual a faixa etária?");
		System.out.println("- 0 a 2. \n- 3 a 5. \n- 6 a 10. \n- Acima de 10.");
		this.faixaEtaria = input.nextLine();
		
		switch(faixaEtaria) {
		case "0 a 2":
			System.out.println("\nVálido!");
		break;
		case "3 a 5":
			System.out.println("\nVálido!");
		break;
		case "6 a 10":
			System.out.println("\nVálido!");
		break;
		case "acima de 10":
			System.out.println("\nVálido!");
		break;
		case "Acima de 10":
			System.out.println("\nVálido!");
		break;
		default:
			System.out.println("\nInválido");
		}
		
	}
	public double getPreço(){
		return this.preço;
	}
	public void setPreço(){
		Scanner input = new Scanner(System.in);
		System.out.print("\nDigite o preço do brinquedo: ");
		this.preço = input.nextDouble();
	}

}
