package Sobrecarga;

public class Relogio {
	
	private int hora;
	private int min;
	private int seg;

	public void setHora(int hora, int min, int seg) {
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}
	
	public void setHora(int hora, int min) {
		this.hora = hora;
		this.min = min;
		this.seg = 0;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
		this.min = 1;
		this.seg = 1;
	}

	public int getHora() {
		return hora;
	}
	
	public int getMin() {
		return min;
	}
	
	public int getSeg() {
		return seg;
	}
	
	
	
	

}
