package Ejercicio3;

import java.util.ArrayList;

public class Personaje {
	
	String nombre;
	String heroe;
	ArrayList <Cualidad> cualidades;
	
	public Personaje(String nombre, String heroe) {
		this.nombre = nombre;
		this.heroe = heroe;
		this.cualidades = new ArrayList <> () ;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getHeroe() {
		return heroe;
	}
	
	public void setHeroe(String heroe) {
		this.heroe = heroe;
	}
	
	public void addCualidad(Cualidad c) {
		if(!cualidades.contains(c)) {
			cualidades.add(c);
		}
	}
	
	public int getNivelOtraCualidad() {
		int nivel=0;
		for(int i=0; i<cualidades.size();i++) {
			nivel= cualidades.get(i).getNivel();
		}return nivel;
	}

	
	public int getNivel(Cualidad c) {
		int nivel=0;
		for(int i=0; i<cualidades.size();i++) {
			if(cualidades.get(i).getPoder()==c.getPoder()) {
				nivel=cualidades.get(i).getNivel();
			}
		}return nivel;
	}

	
	
	
	
}
