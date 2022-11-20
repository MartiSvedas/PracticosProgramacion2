package Ejercicio6;

import java.util.ArrayList;

public class Comite {
	
	String nombre;
	ArrayList <Evaluador> evaluadores;
	ArrayList <Trabajo> trabajos;
	ArrayList <String> temasExperto;
	
	public Comite(String nombre) {
		super();
		this.nombre = nombre;
		this.evaluadores=new ArrayList <> ();
		this.trabajos=new ArrayList <> ();

	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void addEvaluador(Evaluador e) {
		evaluadores.add(e);
	}
	
	public void addTrabajos(Trabajo t) {
		trabajos.add(t);
	}
	
	public boolean esExperto(Evaluador e) {
		boolean experto=false;
		for(int i=0; i<e.getTemas().size();i++) {
			if(this.temasExperto.contains(e.getTemas().get(i))) {
				experto = true;
			}else {
				experto=false;
			}
		}return experto;
	}
	
	public boolean esGeneral(Evaluador e) {
		if(!esExperto(e)) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
