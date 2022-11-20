package Ejercicio2;

import java.util.ArrayList;

public class Casa {
	
	String nombre;
	ArrayList<Alumno> alumnos;
	ArrayList <String> cualidades;
	int cantMax;
	
	public Casa(String nombre,int cantMax) {
		this.cantMax = cantMax;
		this.nombre=nombre;
		this.alumnos=new ArrayList<>();
		this.cualidades=new ArrayList<>();

	}
	
	public boolean tieneCualidades(Alumno a) {
		int i=0;
		while(i<cualidades.size() && a.tieneCualidad(cualidades.get(i))) {
				i++;
		}
		return i==cualidades.size();
	}
	
	public void addAlumno(Alumno a) {
		if(tieneCualidades(a)&& (alumnos.size()<cantMax)){
			alumnos.add(a);
		}
	}
	public void addCualidad (String c) {
		cualidades.add(c);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean Pertenece(Alumno a) {
		return alumnos.contains(a);
	}

	public boolean equals(Object o1) {
		try {
			Casa elOtro = (Casa)o1;
			return nombre.equalsIgnoreCase(elOtro.getNombre());
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Casa [nombre=" + nombre + ", alumnos=" + alumnos + ", cualidades=" + cualidades + ", cantMax=" + cantMax
				+ "]";
	}

	
	
	
	
}
