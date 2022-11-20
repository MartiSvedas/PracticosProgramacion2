package Practico2.Ejercicio4;

import java.util.ArrayList;

public class Usuario {
	
	private String nombre;
	private ArrayList <Turno> turnos;
	

	public Usuario(String nombre, ArrayList<Turno>turnos){
		this.nombre=nombre;
		this.turnos=turnos;
	}
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(ArrayList<Turno> turnos) {
		this.turnos = turnos;
	}



	
}
