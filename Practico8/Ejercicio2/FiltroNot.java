package Ejercicio2;

public class FiltroNot extends Filtro{
	
	private Filtro f;
	
	public FiltroNot(Filtro f) {
		this.f=f;
	}

	@Override
	public boolean cumple(Elementos e) {
		return !f.cumple(e);
	}

}
