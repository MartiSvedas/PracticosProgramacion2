package Ejercicio1;

import java.util.ArrayList;

public class Agroquimicos {
	String nombre;
	ArrayList <Cultivo> cultivos_desaconsejables;
	ArrayList <String> estados_patologicos;
	
	public Agroquimicos(String nombre) {
		super();
		this.nombre = nombre;
		this.cultivos_desaconsejables=new ArrayList<>();
		this.estados_patologicos=new ArrayList<>();
	}
	
	
	
	
}
