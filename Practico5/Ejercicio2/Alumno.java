package Ejercicio2;

import java.util.ArrayList;

public class Alumno {
	
	String nombre;
	Casa casa;
	ArrayList <String> cualidades;
	ArrayList <String> familiares;
	
	public Alumno(String nombre,Casa casa ) {
		this.cualidades=new ArrayList<>();
		this.familiares = new ArrayList<>();
		this.nombre = nombre;
		this.casa=casa;
	}
	public void addCualidad(String c) {
		cualidades.add(c);
	}
	
	public void addFalimiar(String f) {
		familiares.add(f);
	}
	
	public boolean tieneCualidad(String c) {
		return cualidades.contains(c);
	}

	public Casa getCasa() {
		return casa;
	}
	
	public boolean esFamiliar(String f) {
		return familiares.contains(f);
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", casa=" + casa + ", cualidades=" + cualidades + ", familiares="
				+ familiares + "]";
	}
	
	
	
	
	
}
