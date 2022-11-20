package Ejercicio3;

public class Puerto {
	ColaOrdenada barco;
	ColaOrdenada camion;
	
	public Puerto() {
		super();
		barco = new ColaOrdenada();
		camion = new ColaOrdenada();
	}
	
	public void addBarco(Barco b) {
		barco.addOrdenado(b);
	}
	
	public void addCamion(Camion c) {
		camion.addOrdenado(c);
	}
	
	public void cargarBarcoConCamiones() {
		if(!barco.estaVacia()) {
			Barco b =(Barco) barco.siguiente(); 
			b.agregarCamion((Camion)camion.siguiente());
		}
	}
	
	
}
