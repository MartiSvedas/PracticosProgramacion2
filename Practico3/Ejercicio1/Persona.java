package Ejercicio1;

import java.util.ArrayList;

public class Persona {
	
	Integer dni;
	ArrayList <Encuesta> encuestas;
	
	public Persona(Integer dni) {
		this.dni = dni;
		this.encuestas = new ArrayList<> ();
	}
	

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public ArrayList<Encuesta> getEncuestas() {
		return encuestas;
	}

	public void addEncuesta(Encuesta e) {
		if(!encuestas.contains(e) && (!e.Yarespondio(this.dni))) {
			encuestas.add(e);
		}
	}
	
	public boolean Respondio(Encuesta e) {
		return encuestas.contains(e);
	}
	
	
	
//	public boolean equals(Persona o) {
//	try {
//	Persona otro = (Persona)o;
//	if (this.dni == (otro.getDni()))
//		return true;
//	else
//		return false;
//	}
//	catch (Exception e) {
//		return false;
//	}
//}



}
