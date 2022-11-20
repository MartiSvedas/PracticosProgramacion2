package Ejercicio4;

import java.time.LocalTime;

public class FiltroHora extends Filtro {
	LocalTime horaMinima, horaMaxima;
	
	
	public FiltroHora(LocalTime horaMinima, LocalTime horaMaxima) {
		super();
		this.horaMinima = horaMinima;
		this.horaMaxima = horaMaxima;
	}


	@Override
	public boolean cumple(Voto v) {
		return v.getHora().isBefore(horaMaxima) && v.getHora().isAfter(horaMinima);
	}

}
