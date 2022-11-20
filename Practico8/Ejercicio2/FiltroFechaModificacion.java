package Ejercicio2;

import java.time.LocalDate;

public class FiltroFechaModificacion extends Filtro {

	LocalDate fechaModificacion;
	
	public FiltroFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion=fechaModificacion;
	}
	
	@Override
	public boolean cumple(Elementos e) {
		return e.getFechaCreacion().isBefore(this.fechaModificacion);
	}

}
