package Ejercicio4;

import java.time.LocalDate;

public class Futbolista extends Contingente {
	String posicion;
	char dominante; // R (Derecho) o L (Izquierdo)
	Integer cantgoles;
	
	public Futbolista(String nombre, String apellido, Integer nroPasaporte, LocalDate fechanac, boolean enPais, boolean concentrado, String posicion,
			char dominante, Integer cantgoles) {
		
		super(nombre, apellido, nroPasaporte, fechanac, enPais, concentrado);
		this.posicion = posicion;
		this.dominante = dominante;
		this.cantgoles = cantgoles;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public char getDominante() {
		return dominante;
	}

	public void setDominante(char dominante) {
		this.dominante = dominante;
	}

	public Integer getCantgoles() {
		return cantgoles;
	}

	public void setCantgoles(Integer cantgoles) {
		this.cantgoles = cantgoles;
	}
	
	
	
	
	
	
}
