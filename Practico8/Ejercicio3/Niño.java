package Ejercicio3;

public class Niño {
	String nombre, apellido;
	int dni;
	
	public Niño(String nombre, String apellido, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
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

	public int getDni() {
		return dni;
	}

	public void setDni(int edad) {
		this.dni = edad;
	}
	
	public boolean equals(Object otro) {
		try {
			Niño ninio = (Niño) otro;
			return this.getDni()==ninio.getDni();
		}catch(Exception e) {
			return false;
		}
	}
	
	
}
