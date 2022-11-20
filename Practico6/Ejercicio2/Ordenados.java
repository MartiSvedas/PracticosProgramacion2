package Ejercicio2;

import java.util.ArrayList;

public class Ordenados {
	ArrayList<Elemento> elementos;
	
	public Ordenados() {
		this.elementos=new ArrayList <>();
	}
	
	//devuelvo los elementos ordenados
	public void addelemento(Elemento e) {
		boolean encontrado=false;
		int i=0;
		while(!encontrado && i<elementos.size() ) {
			i++;
			if(elementos.get(i).esMayor(e)) {
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
	
	//devuelvo la cmputadora con mayor velocidad
	public Elemento siguiente() {
		Elemento e = elementos.get(0);
		elementos.remove(0);
		return e;
	}
	
	public boolean tieneElementos() {
		return elementos.size()>0;
	}
	
}
