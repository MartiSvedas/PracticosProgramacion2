package Ejercicio4;

import java.util.Comparator;

public class ComparadorAgrupacion implements Comparator <Candidato>{
	
	public int compare(Candidato c1, Candidato c2) {
		return c1.getAgrupacion().compareTo(c2.getAgrupacion());
	}
}
