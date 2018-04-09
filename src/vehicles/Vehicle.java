package vehicles;

public class Vehicle {

	private int cilindrada;
	private int portes;
	private int velocitat_actual = 0;
	private static int velocitat_maxima = 120;
	
	public void Accelerar() {
		if (velocitat_actual < velocitat_maxima) velocitat_actual += 10;
	}
	
	public void Desaccelerar() {
		if (velocitat_actual > 0) velocitat_actual -= 10;
	}
	
}
