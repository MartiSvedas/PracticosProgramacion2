package Ejercicio3;

import java.util.ArrayList;

public class Buzon extends Elementos {
	String ubicacion;
	ArrayList<Niño> niniosbuenos;
	ArrayList<Niño> niniosmalos;
	ArrayList<Carta>cartas;
	
public Buzon(String ubicacion ) {
	this.ubicacion=ubicacion;
	this.niniosbuenos=new ArrayList<>();
	this.cartas= new ArrayList<>();
	this.niniosmalos=new ArrayList<>();

}

public void addNinioBueno(Niño n) {
		niniosbuenos.add(n);
		agregarCarta(n);
}

public void addNinioMalo(Niño n) {
	if(!niniosbuenos.contains(n)) {
		niniosmalos.add(n);
		for (Carta c: cartas) {
			if(c.getNinio().equals(n)) {
				c.addCarbon();
				agregarCarta(n);
			}
		}
	}else {
		addNinioBueno(n);
	}
}

public int cantCartas() {
	return cartas.size();
}

public void agregarCarta(Niño n) {
	for(Carta c:cartas) {
		if(c.getNinio().equals(n)) {
			Carta primera= cartas.get(0);
			cartas.add(primera);
		}else {
			cartas.add(c);
		}
}
	}

public ArrayList<Carta> buscar(Filtro f){
	ArrayList <Carta> resultado= new ArrayList<>();
	for(Carta c: cartas) {
		if(f.cumple(c)) {
			resultado.add(c);
		}
	}return resultado;
}

}
