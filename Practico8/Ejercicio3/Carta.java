package Ejercicio3;

import java.util.ArrayList;

public class Carta  {
	Niño ninio;
	ArrayList <String> regalos;

public Carta(Niño ninio) {
	this.ninio=ninio;
	this.regalos=new ArrayList <>();
}

public Niño getNinio() {
	return ninio;
}

public void setNinio(Niño ninio) {
	this.ninio = ninio;
}

public ArrayList<String> getRegalos() {
	return regalos;
}

public void setRegalos(ArrayList<String> regalos) {
	this.regalos = regalos;
}

public void addCarbon() {
	regalos.clear();
	regalos.add("Trozo de carbon");
}

public boolean deNinioMalo() {
	return regalos.contains("Trozo de carbon");
}

public boolean contieneRegalo(String r) {
	return regalos.contains(r);
}


}
