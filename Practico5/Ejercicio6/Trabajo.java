package Ejercicio6;

import java.util.ArrayList;

public class Trabajo {
	
	String nombre;
	Evaluador evaluador;
	ArrayList <String> palabrasClave;
	
	public Trabajo(String nombre) {
		this.nombre = nombre;
		this.evaluador =null;
		this.palabrasClave=new ArrayList <>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Evaluador getEvaluador() {
		return evaluador;
	}
	
	public void setEvaluador(Evaluador evaluador) {
		if(puedeEvaluar(evaluador)) {
			this.evaluador = evaluador;
		}
	}
	
	public void addPalabrasClave(String p) {
		palabrasClave.add(p);
	}
	
	public boolean puedeEvaluar(Evaluador e) {
		int i=0;
		while(i<palabrasClave.size() && e.esApto(palabrasClave.get(i))) {
			i++;
		}return palabrasClave.size() == i;
	}
	
	public ArrayList<String> getPalabrasClave() {
		return palabrasClave;
	}

	
}
