package Practico2Ejercicio2;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Reunion> reuniones;
	
	public Agenda(ArrayList<Reunion>reuniones) {
		this.reuniones=reuniones;
	}

	public ArrayList<Reunion> getReuniones() {
		return reuniones;
	}

	public void setReuniones(ArrayList<Reunion> reuniones) {
		this.reuniones = reuniones;
	}
	
	public void agregarReunion(Reunion r) {
		for(int i=0; i<reuniones.size();i++) {
			int hora=reuniones.get(i).getHora();
			if(r.getHora()==hora) {
				System.out.println("Ya existe una reunion a esa hora");
			}else {
				reuniones.add(r);
			}
			
		}
	}
}
