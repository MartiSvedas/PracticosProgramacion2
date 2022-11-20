package Ejercicio1;

import java.util.ArrayList;

public class Empleado{
	
	ArrayList <Encuesta> encuestas;
	int dni;
	double sueldo;
	
	public Empleado(int dni, double sueldo) {
		this.encuestas = new ArrayList <>();
		this.dni = dni;
		this.sueldo = sueldo;
	}
	
	
	public ArrayList<Encuesta> getEncuestas() {
		return encuestas;
	}
	
	
	public void setEncuestas(ArrayList<Encuesta> encuestas) {
		this.encuestas = encuestas;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	

	public void addEncuesta(Encuesta e) {
		if(!encuestas.contains(e)&&(!e.Yarespondio(this.dni))) {
			encuestas.add(e);
		}
	}
	
	public boolean Realizo(Encuesta e) {
		return encuestas.contains(e);
	}
//	public String toString() {
//		return dni + encuestas;
//	}
	
	
}

//	public boolean equals(Object o) {
//		try {
//		Empleado otro = (Empleado)o;
//		if (this.dni == (otro.getDni()))
//			return true;
//		else
//			return false;
//		}
//		catch (Exception e) {
//			return false;
//		}
//	}
