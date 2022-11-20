package Ejercicio2;

import java.util.ArrayList;

public class Directorio extends Elementos {
	private ArrayList <Elementos> elementos;

	public Directorio(String nombre) {
		super(nombre);
		this.elementos= new ArrayList <>();
	}
	
	
	public ArrayList<Elementos> getElementos() {
		return elementos;
	}


	@Override
	public double getTamanio() {
		double total=0.0;
		for(Elementos hijos: elementos) {
			total+= hijos.getTamanio();
		}
		return total;
	}

	@Override
	public ArrayList<Elementos> buscar(Filtro f) {
	ArrayList <Elementos> resultados= new ArrayList<>();
		for(Elementos hijos: elementos) {
			resultados.addAll(hijos.buscar(f));
		}
		return resultados;
		
	}
	
	
}
