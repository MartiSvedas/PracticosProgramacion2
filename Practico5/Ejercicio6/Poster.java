package Ejercicio6;

public class Poster extends Trabajo {

	public Poster(String nombre) {
		super(nombre);
	}

	public boolean puedeEvaluar(Evaluador e) {
		boolean encontrado=false;
		for(int i=0; i<super.getPalabrasClave().size();i++) {
			if(e.esApto(palabrasClave.get(i))) {
				encontrado=true;
			}else {
				encontrado=false;
			}
		}return encontrado;
	}
	
}
