package Ejercicio4;

import java.util.ArrayList;

public class Impuesto {
	String nombre;
	ArrayList <Contribuyente> contribuyentes;
	
	public Impuesto() {
		this.contribuyentes =new ArrayList <>();
	}

	public double Recaudado() {
		double total=0;
		for(int i=0; i<contribuyentes.size();i++) {
			if(contribuyentes.get(i).esContribuyente(this)) {
				total+=contribuyentes.get(i).getMonto();
			}
		}return total;
	}
	
	public void addContribuyente(Contribuyente c) {
		contribuyentes.add(c);
	}
	
	public boolean Contribuye (Contribuyente c) {
		return contribuyentes.contains(c);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
