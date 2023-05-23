package Questão03;

public class SistemaDePagamento {
	
final double TAXA_DE_JUROS_PADRAO = 0.02;
      double TaxaDeJurosPadrao;
	
	public double calcularJuros(double valor) {
		return valor * TAXA_DE_JUROS_PADRAO;	
	}

	public double getTAXA_DE_JUROS_PADRAO() {
		return TAXA_DE_JUROS_PADRAO;
	}

	public double getTaxaDeJurosPadrao() {
		return TaxaDeJurosPadrao;
	}

	public void setTaxaDeJurosPadrao(double taxaDeJurosPadrao) {
		TaxaDeJurosPadrao = taxaDeJurosPadrao;
	}
	
	final public double calcularValorTotal(double transacaoFinanceira) {
		double valorTotal = TAXA_DE_JUROS_PADRAO * transacaoFinanceira;
		
		return valorTotal + transacaoFinanceira;
	}
}
