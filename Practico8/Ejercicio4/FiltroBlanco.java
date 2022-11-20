package Ejercicio4;

public class FiltroBlanco extends Filtro {

	@Override
	public boolean cumple(Voto v) {
		return v.getCandidato()==null;
	}

}
