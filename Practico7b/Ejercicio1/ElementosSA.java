package Ejercicio1;

import java.time.LocalDate;

public abstract class ElementosSA {
	String nombre;
	LocalDate fechacreacion;
	
	public ElementosSA(String nombre) {
		this.nombre=nombre;
		this.fechacreacion=LocalDate.now();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechacreacion() {
		return fechacreacion;
	}
	
	public abstract double getTamanio() ;
	public abstract int cantElementos();
}
