//Escreva um programa em Java que leia um vetor de inteiros de tamanho 10 e calcule a média dos 
//valores. Em seguida, exiba todos os valores do vetor que estão abaixo da média.

package questão03;

import java.util.*;

public class Média {

	public static void main(String[] args) {
		
	   Scanner input = new Scanner(System.in);
       int nums[] = new int[10];
       double soma = 0;
       
       System.out.println("Digite números inteiros!");
    
    for(int i = 0; i < nums.length; i++)
    {
    	System.out.println("Digite o número da posição "+i+": ");
    	nums[i] = input.nextInt();
    	
    }
    
    for(int i = 0; i < nums.length; i++)
    {
    	soma += nums[i];
    }
    
    double media = soma / nums.length;
    
    System.out.println("MÉDIA: "+media);
    
    for(int i = 0; i < nums.length; i++)
    {
    	if(nums[i] < media)
    	{
    		System.out.println("\nNúmeros abaixo da média: "+nums[i]);
    	}
    }
    
	}
	

}
