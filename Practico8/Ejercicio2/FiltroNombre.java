package Ejercicio2;

public class FiltroNombre extends Filtro {
	private String nombrebuscado;
	
	public FiltroNombre(String nombre) {
		this.nombrebuscado=nombre;
	}

	@Override
	public boolean cumple(Elementos e) {
		return e.getNombre().contains(nombrebuscado);
	}

}
