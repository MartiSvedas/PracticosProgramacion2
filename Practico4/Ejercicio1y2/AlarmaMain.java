package Ejercicio1y2;

public class AlarmaMain {
	public static void main (String [] args) {
		Sensores as1= new Sensores("Cocina");
		Sensores as2= new Sensores("Comedor");
		Sensores as4= new Sensores("Baño");
		Sensores as5= new Sensores("Habitacion1");
		AlarmaLuminosa al1=new AlarmaLuminosa();
		Alarma a1=new Alarma();
		a1.addSensor(as1);
		a1.addSensor(as2);
		a1.addSensor(as4);
		a1.comprobar();
		al1.encender();
	
		
		


	}
}
