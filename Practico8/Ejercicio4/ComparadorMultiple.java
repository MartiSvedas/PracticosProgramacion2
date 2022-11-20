package Ejercicio4;

import java.util.Comparator;

public class ComparadorMultiple implements Comparator<Candidato> {
	
	private Comparator<Candidato> c1;
	private Comparator<Candidato> c2;
	
	public ComparadorMultiple(Comparator<Candidato> c1, Comparator<Candidato> c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public int compare(Candidato ca1, Candidato ca2) {
		int resu= c1.compare(ca1, ca2);
		if(resu==0) {
			resu=c2.compare(ca1, ca2);
		}
		return resu;
	}
	

}
