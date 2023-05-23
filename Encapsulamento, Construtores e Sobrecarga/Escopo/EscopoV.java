//QUESTÃO 1 - Crie uma classe "EscopoV" com um atributo "numero" e um método "calcular", que receba um 
//parâmetro "numero". Dentro do método, crie uma variável local "resultado" e atribua a ela o 
//valor da multiplicação entre "numero" e "this.numero". Retorne o valor de "resultado". Qual é o 
//escopo da variável "resultado"?

package Escopo;

public class EscopoV {

	private int numero;
	
	public int calcular(int numero) {
		int resultado = numero * this.numero;
		
		return resultado;
	}
	
}
