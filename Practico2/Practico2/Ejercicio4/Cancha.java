package Practico2.Ejercicio4;

import java.util.ArrayList;

public class Cancha {
	
	private String deporte;
	private ArrayList <Turno> turnos;
	private int precio;
	
	public Cancha (String deporte, ArrayList<Turno> turnos, int precio) {
		this.deporte=deporte;
		this.turnos=turnos;
		this.precio=precio;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public ArrayList<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(ArrayList<Turno> turnos) {
		this.turnos = turnos;
	}

	public int getPrecio() {
		if(deporte=="futbol") {
			precio=400;
		} else if( deporte == "paddle") {
			precio = 100;
		}
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	



}
