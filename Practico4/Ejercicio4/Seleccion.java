package Ejercicio4;

import java.util.ArrayList;

public class Seleccion {
	ArrayList <Contingente> contingente;

	public Seleccion() {
		this.contingente = new ArrayList <>();
	}
	
	public void addContingente(Contingente c) {
		contingente.add(c);
	}
	
	public void removeContingente(Contingente c) {
		contingente.remove(c);
	}
	

	
	public String getEstado(Contingente c) {
		String texto=null;
		if(c.isEnPais() && !c.isConcentrado()) {
			texto="Disponible";
		}else if( c.estaViajando()) {
			texto= "Esta viajando";
		}else if(c.isConcentrado()) {
			texto="Esta concentrado";
		}else if(c.isEnPais()) {
			texto= "En pais de origen";
		}
		return texto;
		
			
		
			
	}
	
	
}
