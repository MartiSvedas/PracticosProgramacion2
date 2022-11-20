package Parcialito;

public class FiltroOr extends Filtro {

	private Filtro f1, f2;
	
	public FiltroOr(Filtro f1, Filtro f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}


	public boolean cumple(empleado e) {
		return this.f1.cumple(e)||this.f2.cumple(e);
	}
	
}

