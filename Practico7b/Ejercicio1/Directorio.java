package Ejercicio1;

import java.util.ArrayList;

public class Directorio extends ElementosSA {
	
	ArrayList <ElementosSA> elementos;
	
	public Directorio(String nombre) {
		super(nombre);
		this.elementos=new ArrayList <>();
	}

	public void addElementos(ElementosSA e) {
		elementos.add(e);
	}
	@Override
	public double getTamanio() {
		double tamanioTotal=0.0;
		for(ElementosSA hijo:elementos) {
			tamanioTotal += hijo.getTamanio();
		}
		return tamanioTotal;
		
	}
	
	public int cantElementos() {
		int cant=1;
		for(ElementosSA hijo:elementos) {
			cant+=hijo.cantElementos();
		}return cant;
	}
	
}
