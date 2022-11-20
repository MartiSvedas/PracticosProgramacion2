package Practico2.Ejercicio1;

import java.util.ArrayList;

public class Temporada {

	private ArrayList<Episodio> episodios;
	
	public Temporada(ArrayList<Episodio>episodios) {
		this.episodios=episodios;
	}
	
	public int getCalifTotal() {
		int califTotal = 0;
		for(int i = 0; i<this.episodios.size();i++) {
			califTotal += this.episodios.get(i).getCalificacion();
		}
		return califTotal;
	}
	
	
	public int getpromedioCalificacion() {
		int califTotal = 0;
		for(int i = 0; i<this.episodios.size();i++) {
			califTotal += this.episodios.get(i).getCalificacion();
		}
		return califTotal/getVistos();
	}
	
	public int getVistos() {
		int cantidadVistos = 0;
		for(int i = 0; i<this.episodios.size();i++) {
			if (this.episodios.get(i).getVisto()) {
				cantidadVistos++;
			}
		}
		return cantidadVistos;
	}
	
	public int cantEpisodios() {
		return this.episodios.size();
	}
	
	//esto no se hace
//	public ArrayList<Episodio> getEpisodios () {
//		ArrayList<Episodio> newEpisodios = new ArrayList<>();
//		for(int i = 0; i<this.episodios.size();i++) {
//			newEpisodios.add(this.episodios.get(i));
//		}
//		return newEpisodios;
//	}
}
