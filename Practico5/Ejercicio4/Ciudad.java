package Ejercicio4;

import java.util.ArrayList;

public class Ciudad {
	
	String nombre;
	ArrayList <Impuesto> impuestos;
	
	public Ciudad(String nombre) {
		this.nombre = nombre;
		this.impuestos = new ArrayList <>();
	}
	
	public void addImpuesto(Impuesto i) {
		impuestos.add(i);
	}
	
	
}
