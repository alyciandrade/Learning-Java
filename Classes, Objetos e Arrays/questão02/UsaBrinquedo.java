package questão02;

public class UsaBrinquedo {

	public static void main(String[] args) {
		Brinquedo brinquedo = new Brinquedo();
		
		brinquedo.setNome();
		brinquedo.setFaixaEtaria();
		brinquedo.setPreço();
		
		System.out.println("\nNome do brinquedo: "+brinquedo.getNome());
		System.out.println("Faixa Etária: "+brinquedo.getFaixaEtaria());
		System.out.println("Preço: R$"+brinquedo.getPreço());

	}

}
