package Ejercicio2;

public class Producto {
	double peso;
	double costofabricacion;
	double valorventa;
	String madera;
	String color;
	String nombre;
	
	public Producto(String nombre,double peso, double costofabricacion, double valorventa, String madera, String color) {
		this.nombre=nombre;
		this.peso = peso;
		this.costofabricacion = costofabricacion;
		this.valorventa = valorventa;
		this.madera = madera;
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getCostofabricacion() {
		return costofabricacion;
	}

	public void setCostofabricacion(double costofabricacion) {
		this.costofabricacion = costofabricacion;
	}

	public double getValorventa() {
		return valorventa;
	}

	public double setValorventa(double valorventa) {
		return this.valorventa = valorventa;
	}

	public String getMadera() {
		return madera;
	}

	public void setMadera(String madera) {
		this.madera = madera;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
