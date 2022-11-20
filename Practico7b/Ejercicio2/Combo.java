package Ejercicio2;

import java.util.ArrayList;

public class Combo extends ElementoEnvio {
	ArrayList <ElementoEnvio> elementos;
	
	public Combo(int numeroTraking) {
		super(numeroTraking);
		this.elementos=new ArrayList<>();
	}

	@Override
	public double getPeso() {
		double total=0;
		for(ElementoEnvio hijo: elementos) {
			total+=hijo.getPeso();
		}return total;
	}

	@Override
	public Persona getDestinatario() {
		return elementos.get(0).getDestinatario();
	}

	@Override
	public Persona getRemitente() {
		return elementos.get(0).getRemitente();
	}
	
	public void setnumeroTraking() {
		for(ElementoEnvio hijo:elementos) {
			hijo.setNumeroTraking(this.numeroTraking); 
		}
	}
	
	public void addElemento(ElementoEnvio e) {
		for(ElementoEnvio hijo: elementos) {
			if(!elementos.contains(e)&& hijo.getCiudadDestino().equals(e.getCiudadDestino())) {
				elementos.add(e);
				e.setNumeroTraking(this.numeroTraking);
			}
		}
	}
	
	
}
