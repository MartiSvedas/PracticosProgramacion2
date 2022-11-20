package Ejercicio2;

import java.util.Comparator;

public class ComparadorMultiple implements Comparator <Elementos> {
	Comparator <Elementos> c1;
	Comparator <Elementos> c2;
	
	public ComparadorMultiple(Comparator <Elementos> c1,Comparator <Elementos> c2) {
		this.c1=c1;
		this.c2=c2;
	}
	
	public int compare(Elementos e1,Elementos e2) {
		int resu= c1.compare(e1, e2);
		if(resu==0) {
			resu=c2.compare(e1, e2);
		}return resu;
	}
}
