package Ejercicio2;

import java.util.Comparator;

public class ComparadorTamanioDescendente implements Comparator<Elementos> {
	
	public int compare(Elementos e1, Elementos e2) {
	if(e1.getTamanio()==e2.getTamanio()) {
		return 0;
	}else if(e1.getTamanio()<e2.getTamanio()){
		return 1;
	}else {
		return -1;
	}
		}
}
