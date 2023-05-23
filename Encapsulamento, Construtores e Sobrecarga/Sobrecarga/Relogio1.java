package Sobrecarga;

public class Relogio1 {

	public static void main(String[] args) {
		Relogio relogio = new Relogio();
		
		relogio.setHora(2);
		relogio.setHora(2, 41);
		relogio.setHora(4, 25, 30);
		
		System.out.println(relogio.getHora());
		System.out.println(relogio.getMin());
		System.out.println(relogio.getSeg());
		

	}

}
