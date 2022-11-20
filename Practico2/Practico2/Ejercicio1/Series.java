package Practico2.Ejercicio1;

import java.util.ArrayList;

public class Series {
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private ArrayList<Temporada> temporadas;
	
	public Series(String titulo, String descripcion, String creador, String genero, ArrayList<Temporada> temporadas){
		this.titulo=titulo;
		this.descripcion=descripcion;
		this.creador=creador;
		this.genero=genero;
		this.temporadas=temporadas;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	
//	public Series() {
//		this.temporadas = new ArrayList<>();
//		for ( int i=0;i>temporadas.size();i++) {
//			
//		}
//	}
	
	public int getVistos() {
		int cantvistos=0;
		for(int i = 0; i<this.temporadas.size();i++) {
			cantvistos=this.temporadas.get(i).getVistos();
	}
			return cantvistos;
	
	}
	public int getCalificacion() {
		int califTotal=0;
		for(int i = 0; i<this.temporadas.size(); i++) {
			califTotal=+this.temporadas.get(i).getCalifTotal();
		}
		return califTotal/getVistos();
	}
	
	public boolean getTodosVistos() {
		int cantvistos=0;
		int cantepisodios=0;
		for(int i = 0; i<this.temporadas.size();i++) {
			cantvistos=this.temporadas.get(i).getVistos();
			cantepisodios=+this.temporadas.get(i).cantEpisodios();
		}
		if(cantvistos==cantepisodios) {
			return true;
		}else {
			return false;
		}
	}
}
