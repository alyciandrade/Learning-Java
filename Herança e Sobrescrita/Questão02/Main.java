package Questão02;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		
		Guerreiro guerreiro = new Guerreiro("Thor", 1, 10);
		Mago mago = new Mago("Doutor Estranho", 1, 10);
		Arqueiro arqueiro = new Arqueiro("Gavião Arqueiro", 1, 10);

		do {
		System.out.println("------ESCOLHA SEU PERSONAGEM------");
		System.out.println("\nDigite:");
		System.out.println("1 - Thor");
		System.out.println("2 - Doutor Estranho");
		System.out.println("3 - Gavião Arqueiro");
		System.out.println("4 - Consultar Atributos dos Personagens");
		System.out.println("5 - Sair do Menu.");
		
		num1 = input.nextInt();
		
		
		if(num1 == 1) {
			int num2; 
			
			
			System.out.println("O guerreiro Thor possui a habilidade de 'Ataque Corpo-a-Corpo'.\nQuem você deseja atacar?");
			System.out.println("\nDigite:");
			System.out.println("1 - Doutor Estranho.");
			System.out.println("2 - Gavião Arqueiro.");
			num2 = input.nextInt();	
			
			if(num2 == 1) {
				System.out.println("\n*Você atacou o 'Doutor Estranho'*");
				System.out.println("\nVocê PERDEU 30 pontos de força.\nDoutor Estranho PERDEU 20 pontos de saúde.");
				
				    guerreiro.forca -= 30;
					mago.saude -= 20;
					System.out.println("\nThor - Força Atual: "+guerreiro.getForca());
					System.out.println("Doutor Estranho - Saúde Atual: "+mago.getSaude());
					System.out.println("\n");
					
				
				if(mago.saude <= 0) {
					System.out.println("\n\nVOCÊ DERROTOU O DOUTOR ESTRANHO.");
					System.out.println("Parabéns, você venceu!!!");
					System.out.println("\n\n");
				}
				else if(guerreiro.forca <= 0) {
					System.out.println("SUA FORÇA ACABOU. \n VOCÊ PERDEU!!!");
					System.out.println("\n");
				}
			}
			else if(num2 == 2) {
				System.out.println("\n*Você atacou o 'Gavião Arqueiro'*");
				System.out.println("\nO Gavião Arqueiro PERDEU 20 pontos de saúde");
				
				arqueiro.saude -= 20;
				System.out.println("\nGavião Arqueiro - Saúde Atual:"+arqueiro.getSaude());
				System.out.println("\n");
				
				if(arqueiro.saude <= 0) {
					System.out.println("VOCÊ DERROTOU O GAVIÃO ARQUEIRO.");
					System.out.println("Parabéns, você venceu!!!");
					System.out.println("\n");
				}
			}
				
			}
		
		else if(num1 == 2) {
			
            int num3; 
            
            if(mago.saude < 80) {
            	System.out.println("\n");
				mago.curar();
				mago.saude += 10;
				
				System.out.println("O Doutor Estranho possui a habilidade de CURA. A saúde dele aumentou +10");
				System.out.println("Saúde Atual: "+mago.getSaude());
				System.out.println("\n");
			}
			
			System.out.println("\nO Doutor Estranho possui a habilidade de 'Ataque à Distância'.\nQuem você deseja atacar?");
			System.out.println("\nDigite:");
			System.out.println("1 - Thor.");
			System.out.println("2 - Gavião Arqueiro.");
			
			num3 = input.nextInt();	
			
			if(num3 == 1) {
				System.out.println("\n*Você atacou o 'Thor'*");
				System.out.println("Thor PERDEU 30 pontos de saúde.");
				
				guerreiro.saude -= 30;
				System.out.println("Thor - Saúde Atual: "+guerreiro.getSaude());
				System.out.println("\n");
				
				if(guerreiro.saude <= 0) {
					System.out.println("\nVOCÊ DERROTOU O THOR.");
					System.out.println("Parabéns, você venceu!!!");
					System.out.println("\n\n");
				}
			}
			else if(num3 == 2) {
				System.out.println("\n*Você atacou o 'Gavião Arqueiro'*");
				System.out.println("\n");
				arqueiro.fugir();
				
				System.out.println("Gavião Arqueiro fugiu do seu ataque, pois ele possui a habilidade de FUGA");				
	            System.out.println("\nVOCÊ PERDEU!!!");
				System.out.println("\n");
				
			}
		}
		else if (num1 == 3) {
			
			int num4;
			
			System.out.println("\nO Gavião Arqueiro possui a habilidade de 'Ataque à Distância'.\nQuem você deseja atacar?");
			System.out.println("\nDigite:");
			System.out.println("1 - Thor.");
			System.out.println("2 - Doutor Estranho.");
			num4 = input.nextInt();	
			
			if(num4 == 1) {
				System.out.println("\n*Você atacou o 'Thor'*");
				System.out.println("Você PERDEU 20 pontos de força e Thor PERDEU 10 pontos de saúde.");
				
				    arqueiro.forca -= 20;
					guerreiro.saude -= 10;
					System.out.println("\nGavião Arqueiro - Força Atual: "+arqueiro.getForca());
					System.out.println("Thor - Saúde Atual: "+guerreiro.getSaude());
					System.out.println("\n");
					
					
					if(arqueiro.forca <= 0) {
						System.out.println("SUA FORÇA ACABOU.");
						System.out.println("\nVOCÊ PERDEU!!!\n");
					}
	
			}
			else if(num4 == 2) {
				System.out.println("\nVocê atacou o 'Doutor Estranho'.");
				System.out.println("Doutor Estranho PERDE 10 pontos de saúde");
				
				mago.saude -= 10;
				
				System.out.println("Saúde Atual: "+mago.getSaude());
				System.out.println("\n");
			
			if(mago.saude <= 0) {
				System.out.println("\n\nVOCÊ DERROTOU O DOUTOR ESTRANHO.");
				System.out.println("Parabéns, você venceu!!!");
				System.out.println("\n\n");
			}			
				
			}		
			
		}	
		else if(num1 == 4) {
			
			System.out.println("\t\t----------------- PERSONAGENS -----------------");
			System.out.println("--- Thor --- \t\t--- Doutor Estranho --- \t--- Gavião Arqueiro ---");
			System.out.println("saude: "+guerreiro.getSaude()+ "\t\tsaude: "+mago.getSaude()+ "\t\t\tsaude:" +arqueiro.getSaude());
			System.out.println("força: "+guerreiro.getForca()+ "\t\tforça: "+mago.getForca()+ "\t\t\tforça:" +arqueiro.getForca());
			System.out.println("inteligência: "+guerreiro.getInteligencia()+ "\tinteligência: "+mago.getInteligencia()+ "\t\tinteligência:" +arqueiro.getInteligencia());
			System.out.println("velocidade: "+guerreiro.getVelocidade()+ "\t\tvelocidade: "+mago.getVelocidade()+ "\t\t\tvelocidade:" +arqueiro.getVelocidade());
			System.out.println("\n");
			
		}
		
		}while(num1 != 5);
		
	}
}
