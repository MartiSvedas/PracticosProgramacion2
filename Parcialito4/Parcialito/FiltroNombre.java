package Parcialito;

public class FiltroNombre extends Filtro {
	private String nombreBuscado;
	
	
	public FiltroNombre(String nombreBuscado) {
		super();
		this.nombreBuscado = nombreBuscado;
	}


	@Override
	public boolean cumple(empleado e) {
		return e.getNombre().equals(this.nombreBuscado);
	}

}
