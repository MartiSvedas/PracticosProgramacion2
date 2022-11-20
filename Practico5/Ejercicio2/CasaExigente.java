package Ejercicio2;

import java.util.ArrayList;

public class CasaExigente extends Casa {
	
	ArrayList <String> integrantes;

	public CasaExigente(String nombre, int cantMax) {
		super(nombre, cantMax);
		this.integrantes= new ArrayList<>();
	}
	
	public boolean cumpleCondicion(Alumno a) {
		boolean cumple=false;
		boolean tieneCualidades= super.tieneCualidades(a);
		if(tieneCualidades) {
			for(int i=0; i<integrantes.size();i++) {
				if(mismaCasa(integrantes.get(i),a)) {
					cumple=true;
				}else {
					cumple =false;
				}
				
			}return cumple;
			
		}else {
			return false;
		}
	}
	
	public boolean mismaCasa(String f, Alumno a) {
		return a.esFamiliar(f);
	}
	
	public void addIntegrante(String i) {
		integrantes.add(i);
	}

}
