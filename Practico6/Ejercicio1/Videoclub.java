package Ejercicio1;

import java.util.ArrayList;

public class Videoclub {
	
	String nombre;
	ArrayList <Item> items;
	
	public Videoclub(String nombre) {
		super();
		this.nombre = nombre;
		this.items=new ArrayList <>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public ArrayList<Cliente> getClientesAlquilerVencido() {
		ArrayList<Cliente> resultado= new ArrayList<>() ;
		for(Item i:items){
			if(i.getFechaAlquiler().isAfter(i.getFechaLimite())) {
				resultado.addAll(i.getClientes());
			}
		}return resultado;
	}
	
	
}
