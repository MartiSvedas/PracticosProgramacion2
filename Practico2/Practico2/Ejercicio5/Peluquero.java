package Practico2.Ejercicio5;

public class Peluquero {
	
	private String nombre;
	private boolean disponible;

	
	public Peluquero(String nombre, boolean disponible) {
		this.nombre = nombre;
		this.disponible = disponible;

	}
	
	
	


	public Peluquero(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	
	
	
	
	
}
