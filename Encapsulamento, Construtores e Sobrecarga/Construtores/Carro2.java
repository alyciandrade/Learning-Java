//QUESTÃO 6 

package Construtores;

public class Carro2 {

	public static void main(String[] args) {
		
		Carro automovel = new Carro("0", "preto");
		
		automovel.setMarca(null);
		automovel.setModelo(null);
	
		System.out.println(automovel.getMarca());
		System.out.println(automovel.getModelo());
		System.out.println(automovel.getCor());
		System.out.println(automovel.getAno());
		
		
		

	}

}
