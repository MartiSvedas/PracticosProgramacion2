package Ejercicio3;

import java.util.ArrayList;

public class Zona extends Elementos {
	ArrayList<Elementos> elementos;
	
	public Zona() {
		super();
		this.elementos = new ArrayList<>();
	}

	public void addElementos(Elementos e) {
		elementos.add(e);
	}

	@Override
	public ArrayList<Carta> buscar(Filtro f) {
		ArrayList <Carta> resultado= new ArrayList <>();
		for(Elementos e: elementos) {
			resultado.addAll(e.buscar(f));
		}return resultado;
	}

	@Override
	public int cantCartas() {
		int total=0;
		for(Elementos e: elementos) {
			total+= e.cantCartas();
		}return total;
	}
}
