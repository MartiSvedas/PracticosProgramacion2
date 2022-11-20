package Ejercicio3;

public class Pastura extends Cereal {

	public Pastura(String nombre) {
		super(nombre);
	}
	
	public boolean puedeSembrarse(Lote l) {
		if(super.puedeSembrarse(l)&& (l.getHectareas()>50)) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	

	
}
