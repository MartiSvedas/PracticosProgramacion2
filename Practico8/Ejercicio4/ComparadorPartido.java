package Ejercicio4;

import java.util.Comparator;

public class ComparadorPartido implements Comparator<Candidato>{

	public int compare (Candidato c1, Candidato c2) {
		return c1.getPartidoPolitico().compareTo(c2.getPartidoPolitico());
	}
}
