package Ejercicio4;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Candidato>{

	public int compare (Candidato c1, Candidato c2) {
		return c1.getNombre().compareTo(c2.getNombre());
	}
}
