package Ejercicio3;

import java.util.ArrayList;

public abstract class Elementos {
	
	public abstract ArrayList<Carta> buscar(Filtro f);
	
	public double calcularPorcentaje(Filtro f) {
		return buscar(f).size() / cantCartas() *100;
	}
	
	public abstract int cantCartas();

}
