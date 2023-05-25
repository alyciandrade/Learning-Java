package Questão02;

public class Aviao {
	
	static int quantidadeAvioes; //Quantidade total de aviões em serviço.
	static int somaPassageiros; //Soma total de passageiros transportados em todos os voos.
	
	static void adicionarAviao(int qntPassageiros) {
		
		quantidadeAvioes += 1;
		somaPassageiros += qntPassageiros;
		
	}
	
	static int calcularMediaPassageiros() {
		
		if(quantidadeAvioes == 0) {
			return 0;
		}else {
			return somaPassageiros / quantidadeAvioes;
		}
	}

}
