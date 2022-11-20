package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Elecciones {
	ArrayList <Candidato> candidatos;

	public Elecciones() {
		super();
		this.candidatos = new ArrayList <>();
	}

	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}

	
	public void addCandidato(Candidato c) {
		candidatos.add(c);
	}
	
	public ArrayList <Candidato> buscarOrdenado(Comparator <Candidato> orden){
		ArrayList <Candidato> resultado= this.candidatos;
		Collections.sort(resultado,orden);
		return resultado;
	}
	
	
	
	
}
