package Ejercicio1;

import java.time.LocalDate;

public class Archivo extends ElementosSA{
	 LocalDate fechaultimamod;
	 double tamanio;
	 
	 public Archivo(String nombre, double tamanio) {
		 super (nombre);
		 this.tamanio=tamanio;
		 this.fechaultimamod=LocalDate.now();
	 }

	@Override
	public double getTamanio() {
		return this.tamanio;
	}

	public LocalDate getFechaultimamod() {
		return fechaultimamod;
	}

	public void setFechaultimamod() {
		this.fechaultimamod = LocalDate.now();
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public int cantElementos() {
		return 1;
	}
	
	
	 
}
