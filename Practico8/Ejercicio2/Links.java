package Ejercicio2;

import java.util.ArrayList;

public class Links extends Elementos {

	public Links(String nombre) {
		super(nombre);
	}
	
	@Override
	public double getTamanio() {
		return 1;
	}

	@Override
	public ArrayList<Elementos> buscar(Filtro f) {
		ArrayList <Elementos> resultado= new ArrayList<>();
		resultado.add(this);
		return resultado;
	}

}
