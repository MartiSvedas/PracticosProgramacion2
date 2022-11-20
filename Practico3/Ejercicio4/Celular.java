package Ejercicio4;

import java.util.ArrayList;

public class Celular {
	
	ArrayList<Contacto> contactos;
	ArrayList<Contacto> contactos_repetidos;
	
	public Celular() {
		this.contactos = new ArrayList<>();
		this.contactos_repetidos = new ArrayList<>();
	}
	
	public void addContactos(Contacto c) {
		if(!contactos.contains(c)) {
			contactos.add(c);
		}
	}
	
	public void addContactosRepetidos() {
		for(int i=0; i<contactos.size(); i++) {
			for(int j=0; j<contactos.size();j++) {
				
				if(contactos.get(i).equals(contactos.get(j)) 
						&& !contactos_repetidos.contains(contactos.get(j))) {
					contactos_repetidos.add(contactos.get(j));		
			}
			}
		}
	}
	
	public ArrayList<Contacto> mismoTelefono (){
		
		ArrayList <Contacto> salida= new ArrayList<Contacto>();
		for(int i=0; i<contactos.size(); i++) {
			for(int j=0; j<contactos.size();j++) {
				
			if(contactos.get(i).getTelefono()==contactos.get(j).getTelefono()
					&& !salida.contains(contactos.get(j))) {
				salida.add(contactos.get(j));
			}
		}
		}return salida;

	}
	
	public int getPromedio() {
		int suma=0;
		int promedio=0;
		for(int i=0; i<contactos.size(); i++) {
			suma+=contactos.get(i).getEdad();
		}
		promedio= suma/contactos.size();
		return promedio;

	}
	
	
}
