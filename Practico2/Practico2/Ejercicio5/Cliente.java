package Practico2.Ejercicio5;


public class Cliente {
	
	private String nombre;
	private double descuento;

	
	public Cliente( String nombre, double descuento) {
		this.nombre=nombre;
		this.descuento=10;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDescuento() {
		return descuento;
	}



	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	
}
