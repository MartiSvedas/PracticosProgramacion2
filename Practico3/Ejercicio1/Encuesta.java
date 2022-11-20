package Ejercicio1;

import java.util.ArrayList;


public class Encuesta {

		ArrayList <Integer> dnipersona;
		ArrayList <String> preguntas;
		
		
		public Encuesta() {
			this.dnipersona= new ArrayList<>();
			this.preguntas = new ArrayList <> ();
		}
		
		public void setPreguntas(ArrayList<String> preguntas) {
			this.preguntas = preguntas;
		}

		public ArrayList<String> getPreguntas() {
			return preguntas;
		}

		public void setPreguntas() {
			this.preguntas = new ArrayList<>();
		}
		
		public void addDNIpersona(Persona p) {
			if(!this.dnipersona.contains(p.getDni())) {
				dnipersona.add(p.getDni());
			}
		}
		public boolean Yarespondio(Integer dni) {
			return this.dnipersona.contains(dni);
		}
		
		
		
		
} 
