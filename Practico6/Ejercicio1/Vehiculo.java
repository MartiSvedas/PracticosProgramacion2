package Ejercicio1;

import java.time.LocalDate;

public class Vehiculo extends Item {
	
	String marca;
	Integer kms, patente;


	
	public Vehiculo(String nombre,String marca, Integer kms,Integer patente) {
		 super(nombre);
		this.marca = marca;
		this.kms = kms;
		this.patente = patente;
	}

	@Override
	public boolean puedeAlquilarse(Cliente c) {
		return c.estaAlquilado(this);
	}

}
