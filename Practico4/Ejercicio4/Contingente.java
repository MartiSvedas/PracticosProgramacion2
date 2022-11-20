package Ejercicio4;

import java.time.LocalDate;

public class Contingente {
	 String nombre;
	 String apellido;
	 Integer nroPasaporte;
	 LocalDate fechanac;
	 boolean enPais;
	 boolean concentrado;
	 
	public Contingente(String nombre, String apellido, Integer nroPasaporte, LocalDate fechanac,boolean enPais, boolean concentrado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroPasaporte = nroPasaporte;
		this.fechanac = fechanac;
		this.enPais=enPais;
		this.concentrado=concentrado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getNroPasaporte() {
		return nroPasaporte;
	}

	public void setNroPasaporte(Integer nroPasaporte) {
		this.nroPasaporte = nroPasaporte;
	}

	public LocalDate getFechanac() {
		return fechanac;
	}

	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}

	public boolean isEnPais() {
		return enPais;
	}

	public void setEnPais(boolean enPais) {
		this.enPais = enPais;
	}

	public boolean isConcentrado() {
		return concentrado;
	}

	public void setConcentrado(boolean concentrado) {
		this.concentrado = concentrado;
	}

	public boolean estaDisponible() {
		if(this.enPais && !this.concentrado) {
			return true;
		}
		return false;
		
	}
	public boolean estaViajando() {
		if(!this.enPais) {
			return true;
		}return false;
	}
	
	 
	 

}
