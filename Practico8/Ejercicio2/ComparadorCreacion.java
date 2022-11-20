package Ejercicio2;

import java.util.Comparator;

public class ComparadorCreacion implements Comparator <Elementos>{
	
	public int compare(Elementos e1, Elementos e2) {
		return e1.getFechaCreacion().compareTo(e2.getFechaCreacion()); 	
}
}
