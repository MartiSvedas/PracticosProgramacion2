package Ejercicio3;

import java.util.ArrayList;

public class Lote {
	
	String nombre;
	Cereal cereal;
	ArrayList <String> minerales;
	double hectareas;
	
	public Lote( double hectareas, String nombre) {
		this.cereal=null;
		this.hectareas=hectareas;
		this.minerales= new ArrayList <>();
		this.nombre=nombre;
	}

	public double getHectareas() {
		return hectareas;
	}

	public void setHectareas(double hectareas) {
		this.hectareas = hectareas;
	}
	
	public boolean tieneMineral(String m) {
		return minerales.contains(m);
	}
	
	public void addminerales(String m) {
		minerales.add(m);
	}
	
	public boolean puedeSembrarse(Cereal c) {
		return c.puedeSembrarse(this);
	}
	
	public void setCereal(Cereal c) {
		if(puedeSembrarse(c)) {
			this.cereal=c;
		}
	}

	@Override
	public String toString() {
		return "Lote [nombre=" + nombre + ", cereal=" + cereal + ", minerales=" + minerales + ", hectareas=" + hectareas
				+ "]";
	}
	
	
	
	

}
