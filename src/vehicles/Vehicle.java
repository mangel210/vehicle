package vehicles;

public class Vehicle {

	private int cilindrada;
	private int portes;
	private int velocitat_actual = 0;
	private int marxa_actual = 0;
	private static int velocitat_maxima = 120;
	private static int marxes = 5;
		
	public Vehicle() {
		super();
		this.velocitat_actual = 0;
		this.marxa_actual = 0;
	}

	public void Accelerar() {
		if (velocitat_actual < velocitat_maxima) velocitat_actual += 10;
	}
	
	public void Desaccelerar() {
		if (velocitat_actual > 0) velocitat_actual -= 10;
	}
	
	public void pujaMarxa() {
		if (marxa_actual < marxes) this.marxa_actual++;
	}
	
	public void baixaMarxa() {
		if (marxa_actual > 0) this.marxa_actual--;
	}
}
