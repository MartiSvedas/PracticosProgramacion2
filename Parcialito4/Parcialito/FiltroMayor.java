package Parcialito;

public class FiltroMayor extends Filtro {
	public int legajoMax;

	public FiltroMayor(int legajoMax) {
		super();
		this.legajoMax = legajoMax;
	}

	@Override
	public boolean cumple(empleado e) {
		return e.getNroLegajo()<this.legajoMax;
	}
	
	
}
