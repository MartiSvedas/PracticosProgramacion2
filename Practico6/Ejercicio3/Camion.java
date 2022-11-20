package Ejercicio3;

import java.time.LocalDate;

public class Camion extends Elemento {
	LocalDate fechaCarga;
	
	public Camion(LocalDate fecha) {
		this.fechaCarga=fecha;
	}
	
	
	public LocalDate getFechaCarga() {
		return fechaCarga;
	}


	@Override
	public boolean esMayor(Elemento o) {
		return this.fechaCarga.isBefore(((Camion)o).getFechaCarga());
	}

}
