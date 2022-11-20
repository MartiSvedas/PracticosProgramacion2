package Ejercicio5;

public class EmpleadoFijo {
	
	String nombre, apellido;
	Integer DNI;
	double sueldo;
	
	public EmpleadoFijo(String nombre, String apellido, Integer dNI, double sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	@Override
	public String toString() {
		return "EmpleadoFijo [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", sueldo=" + sueldo
				+ "]";
	}
	
	

}
