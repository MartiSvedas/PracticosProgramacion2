package Ejercicio6;

import java.util.ArrayList;

public class Evaluador {
	
	String nombre;
	ArrayList <Trabajo> trabajos;
	ArrayList <String> temas;
	
	public Evaluador(String nombre) {
		this.nombre = nombre;
		this.trabajos= new ArrayList<>();
		this.temas= new ArrayList<>();

	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	
	public boolean esApto(String tema) {
		return temas.contains(tema);
	}
	
	public void addTrabajos(Trabajo t) {
		if(t.puedeEvaluar(this)) {
			trabajos.add(t);
		}
	}
	
	public Integer getcantTrabajos() {
		return trabajos.size() + 1;
	}
	public ArrayList<String> getTemas() {
		return temas;
	}
	
	
	
}
