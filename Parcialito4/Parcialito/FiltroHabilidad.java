package Parcialito;

public class FiltroHabilidad extends Filtro {
	private String HabilidadBuscada;
	
	
	
	public FiltroHabilidad(String habilidadBuscada) {
		super();
		HabilidadBuscada = habilidadBuscada;
	}

	@Override
	public boolean cumple(empleado e) {
		return e.getHabilidades().contains(this.HabilidadBuscada);
	}

}
