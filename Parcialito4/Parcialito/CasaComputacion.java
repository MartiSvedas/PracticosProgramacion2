package Parcialito;

import java.util.ArrayList;

public class CasaComputacion {
	String nombre;
	ArrayList <empleado> empleados;
	
	public CasaComputacion(String nombre) {
		super();
		this.nombre = nombre;
		this.empleados = new ArrayList <>();
	}
	
	public ArrayList <empleado> buscar (Filtro f){
		ArrayList<empleado> resultado = new ArrayList<>();
		for(empleado e :empleados) {
			if(f.cumple(e)) {
				resultado.add(e);
			}
		}return resultado;
	}
	
	
}
