package Ejercicio4;

import java.time.LocalTime;

public class Voto {
	Candidato candidato;
	LocalTime hora;
	
	public Voto() {
		super();
		this.candidato = null;
		this.hora=LocalTime.now();
	}
	
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public LocalTime getHora() {
		return hora;
	}

	
	

	
	
	
	
}
