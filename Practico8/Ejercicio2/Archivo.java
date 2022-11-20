package Ejercicio2;

import java.util.ArrayList;

public class Archivo extends Elementos {
	private double tamanio;

	public Archivo(String nombre,double tamanio) {
		super(nombre);
		this.setTamanio(tamanio);
	}
	@Override
	public double getTamanio() {
		return this.tamanio;
	}
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	@Override
	public ArrayList<Elementos> buscar(Filtro f) {
		ArrayList<Elementos> resultado=new ArrayList<>();
		if(f.cumple(this)) {
			resultado.add(this);
		}return resultado;
		}
	
}
