package Practico2Ejercicio2;

import java.util.ArrayList;

public class AgendaMain {
	
	public static void main (String[]args) {
		ArrayList<Participante> participantes = new ArrayList<>();
		ArrayList<Reunion> reuniones= new ArrayList<>();
		Participante p= new Participante(249451, "pepito@gmail.com", "Pepito");
		participantes.add(p);
		Reunion r= new Reunion("Argentina", "Politica", 20, 17, participantes);
		r.agregarParticipante(p);
		Participante p1= new Participante(243241, "juan@gmail.com", "JUan");
		r.agregarParticipante(p1);
		Agenda a= new Agenda(reuniones);
		a.agregarReunion(r);
	}
}
