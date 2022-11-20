package Ejercicio4;

import java.time.LocalDate;

public class Entrenador extends Contingente {

	Integer id;

	public Entrenador(String nombre, String apellido, Integer nroPasaporte, LocalDate fechanac,boolean enPais, boolean concentrado, Integer id) {
		super(nombre, apellido, nroPasaporte, fechanac, enPais, concentrado);
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
}
