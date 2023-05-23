package Encapsulamento;

import java.util.*;

public class Cliente1{
	

public static void main (String[] args){
	Scanner input = new Scanner (System.in);
	Cliente c1 = new Cliente();
	
	String nome;
	
	System.out.println("Digite um nome: ");
	nome = input.nextLine();
	
	c1.setNomeCompleto(nome);
	  	
   }

}
