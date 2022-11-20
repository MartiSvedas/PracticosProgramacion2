package Ejercicio3;

public class FiltroNinioMalo extends Filtro {

	@Override
	public boolean cumple(Carta c) {
		return c.deNinioMalo();
	}

}
