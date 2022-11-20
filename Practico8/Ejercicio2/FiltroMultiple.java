package Ejercicio2;

public class FiltroMultiple extends Filtro {

	private Filtro f1, f2;
	
	public FiltroMultiple(Filtro f1, Filtro f2) {
		this.f1=f1;
		this.f2=f2;
	}
	
	@Override
	public boolean cumple(Elementos e) {
		return f1.cumple(e) && f2.cumple(e);
	}

}
