//QUESTÃO 2 - Modifique o método "calcular" da questão anterior para que ele crie uma variável local 
//"numero" e atribua a ela o valor do parâmetro recebido. Qual é o escopo da variável "numero"? 
//Ela tem algum conflito com o atributo "numero" da classe?
//Responda: O método acima pode ser compilado? Justifique sua resposta.

package Escopo;

public class EscopoV1{

public int calcular(int numero) {
    int resultado = numero * this.numero;
    return resultado;
  }
}

//Resposta: Não pois precisa ser uma variável global.