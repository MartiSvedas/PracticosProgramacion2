package Ejercicio1;

import java.time.LocalDate;

public class Pelicula extends Item {
	
	String infoFilmografica;
	Integer cantCopias;
	
	
	
	public Pelicula(String nombre,String infoFilmografica,Integer cantCopias) {
		super(nombre);
		this.infoFilmografica = infoFilmografica;
		this.cantCopias = cantCopias;
	}
	
	@Override
	public boolean puedeAlquilarse(Cliente c) {
		return this.cantCopias != 0;
	}
	
	@Override
	public void alquilar(Cliente c) {
		super.alquilar(c);
		cantCopias--;
	}
	
	
	
	

}
