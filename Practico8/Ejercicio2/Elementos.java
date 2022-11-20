package Ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Elementos {
	private String nombre;
	private LocalDate fechacreacion;
	
	public Elementos(String nombre) {
		this.setNombre(nombre);
		this.fechacreacion = LocalDate.now();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public LocalDate getFechaCreacion() {
		return this.fechacreacion;
	}
	
	public abstract double getTamanio();
	
	public abstract ArrayList<Elementos> buscar (Filtro f);
	
	public ArrayList<Elementos> buquedaOrdenada(Filtro f, Comparator <Elementos> comparador) {
		ArrayList <Elementos> resultado= this.buscar(f);
		Collections.sort(resultado,comparador);
		return resultado;
		
	}
		

}
