package Ejercicio4;

import java.time.LocalDate;

public class Masajista extends Contingente {
	
	String titulo;
	double añosExperiencia;
	
	
	public Masajista(String nombre, String apellido, Integer nroPasaporte, LocalDate fechanac,boolean enPais, boolean concentrado, String titulo,
			double añosExperiencia) {
		super(nombre, apellido, nroPasaporte, fechanac, enPais, concentrado);
		this.titulo = titulo;
		this.añosExperiencia = añosExperiencia;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public double getAñosExperiencia() {
		return añosExperiencia;
	}


	public void setAñosExperiencia(double añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}
	
	
	
	
	
}
