package Ejercicio1y2;

public class AlarmaLuminosa extends Alarma {
	
	public AlarmaLuminosa() {
		super();
	}
	
	public void encender() {
		if(super.comprobar()) {
			Luz.encender();	
		}
	}
	
}
