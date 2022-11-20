package Practico2Ejercicio2;

import java.util.ArrayList;

public class Reunion {
	
	private int hora;
	private String lugar;
	private String tema;
	private int duracion;
	private ArrayList<Participante> participantes;
	
	public Reunion(String lugar, String tema, int duracion,int hora, ArrayList<Participante> participantes) {
		this.lugar=lugar;
		this.tema=tema;
		this.duracion=duracion;
		this.participantes=participantes;
		this.hora=hora;
	}

	public void agregarParticipante(Participante p) {
			if(!participantes.contains(p)) {
				participantes.add(p);
				System.out.println("Agregado");
			}
			
	}
	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(ArrayList<Participante> participantes) {
		this.participantes = participantes;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	
}
