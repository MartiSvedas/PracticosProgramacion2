package Ejercicio3;

import java.util.ArrayList;

public class ColaOrdenada {
	ArrayList <Elemento> elementos;
	
	public ColaOrdenada() {
		this.elementos=new ArrayList <>();
	}
	
	public void addOrdenado(Elemento e) {
		boolean encontrado= false;
		int i=0;
		while(!encontrado && i<elementos.size()) {
			i++;
			if(elementos.get(i).esMayor(e)){
				encontrado=true;
			}else {
				encontrado=false;
			}
		}if(encontrado) {
			elementos.add(i,e);
		}else {
			elementos.add(e);
		}
	}
	
	public Elemento siguiente() {
		Elemento e= elementos.get(0);
		elementos.remove(e);
		return e;
	}
	
	public boolean estaVacia() {
		return elementos.isEmpty();
	}
	
}
