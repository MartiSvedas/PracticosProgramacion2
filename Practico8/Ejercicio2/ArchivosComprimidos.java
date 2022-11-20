package Ejercicio2;

import java.util.ArrayList;

public class ArchivosComprimidos extends Directorio {
	double tasa;
	
	public ArchivosComprimidos(String nombre, double tasa) {
		super(nombre);
		this.tasa=tasa;
	}
	
	public double getTamanio() {
		return super.getTamanio() /tasa;
	}
	
	@Override
	public ArrayList<Elementos> buscar(Filtro f){
		ArrayList<Elementos> resultado=new ArrayList <>();
		for(Elementos hijos:super.getElementos()) {
			if(f.cumple(hijos)) {
				resultado.add(this);
			}
		}
		return resultado;
	}

}
