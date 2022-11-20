package Practico2.Ejercicio3;

import java.util.ArrayList;

public class Provincia {
	private String nombre;
	private ArrayList <Ciudad> ciudades;
	
	public Provincia(String nombre, ArrayList<Ciudad> ciudades) {
		this.nombre=nombre;
		this.ciudades=ciudades;
		
	}
	
	public boolean Endeficit() {
		int contador=0;
		for(int i =0; i<ciudades.size(); i++) {
			if(ciudades.get(i).gastanMas()) {
				contador++;
			}
		}if(contador>ciudades.size()/2) {
			return true;
		}else {
			return false;
		}
	}
	
	public void AgregarCiudad(Ciudad c) {
			ciudades.add(c);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(ArrayList<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	
}
