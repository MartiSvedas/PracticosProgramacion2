package Ejercicio2;

public class FiltroOr extends Filtro {

	private Filtro f1, f2;
	
	public FiltroOr(Filtro f1, Filtro f2) {
		this.f1=f1;
		this.f2=f2;
	}
	
	@Override
	public boolean cumple(Elementos e) {
		return f1.cumple(e) || f2.cumple(e);
	}
}
