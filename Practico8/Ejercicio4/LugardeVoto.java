package Ejercicio4;

import java.util.ArrayList;

public class LugardeVoto {
	ArrayList <Persona> personas;
	ArrayList <Voto> votos;
	
	public LugardeVoto() {
		personas=new ArrayList<>();
		votos=new ArrayList<>();
	}
	
	public boolean puedeVotar(Persona p) {
		return personas.contains(p);
	}
	
	public void addVoto(Voto v, Candidato c) {
		votos.add(v);
			if(v.getCandidato()!=null) {
				v.setCandidato(c);
			}
	}
	
	public void addPersona(Persona p) {
		personas.add(p);
	}
	
	public int getTotalVotos() {
		return votos.size();
	}
	
	public double getPorcentaje(Filtro f) {
		return buscar(f).size() / getTotalVotos() *100;
	}
	
	public ArrayList<Voto> buscar (Filtro f){
		ArrayList <Voto> resultado= new ArrayList <>();
		for(Voto v: votos) {
			if(f.cumple(v)) {
				votos.add(v);
			}
		}return resultado;
	} 
}
