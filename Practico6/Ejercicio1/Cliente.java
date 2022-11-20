package Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
	
	String nombre;
	ArrayList <Item> itemAlquilados;
	
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
		this.itemAlquilados = new ArrayList <>();
	}
	
	public void alquilarItem(Item i) {
		if(i.puedeAlquilarse(this)) {	
			itemAlquilados.add(i);
			i.alquilar(this);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Item> getItemAlquilados() {
		return itemAlquilados;
	}
	
	public boolean estaAlquilado(Item i) {
		return itemAlquilados.contains(i);
	}
	

}
