package Practico2.Ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Peluqueria {
	
	private ArrayList <Peluquero> peluqueros;
	private ArrayList <Turno> turnos;
	private double precio;
	
	public Peluqueria( double descuento, double precio) {
		this.peluqueros=new ArrayList<>();
		this.turnos=new ArrayList<>();
		this.precio=precio;
	}
	
	
	public Turno getPrimerTurno() {
		Turno turno = new Turno();
		for(int i=0; i<turnos.size();i++) {
			if(turnos.get(i).getFecha().isBefore(turnos.get(i+1).getFecha())) {
				turno = turnos.get(i);	
				}
	
		}return turno;
		
	}
	
	public Turno getPrimerTurnoPeluquero(Peluquero peluqueroDeseado) {
		Turno turno = new Turno();
		for(int i=0; i<turnos.size();i++) {
			if(peluqueroDisponible(peluqueroDeseado)) {
				if(turnos.get(i).getFecha().isBefore(turnos.get(i+1).getFecha())
					&& turnos.get(i).getPeluquero().equals(peluqueroDeseado)) {
						turno = turnos.get(i);	
				}
			}
	}return turno;
		}
	
	public void sacarTurno(Cliente cliente, Peluquero peluqueroDeseado, LocalDate fecha ) {
		if(peluqueroDisponible(peluqueroDeseado)) {
			turnos.add(new Turno(cliente, peluqueroDeseado,fecha));
		}else {
			System.out.println("El peluquero no esta disponible");
		}
	}


	public boolean peluqueroDisponible(Peluquero peluquero) {
		 for(int i=0; i<peluqueros.size(); i++) {
				if(peluqueros.get(i).equals(peluquero) && peluqueros.get(i).isDisponible())
					return true;
		 }
		 return false;
	}

	public boolean clienteEsFrecuente(Cliente cliente) {
		int turnossacados=0;
		LocalDate hoy= LocalDate.now();
		LocalDate fechaultimomes=  hoy.minusMonths(1);
		 for(int i=0; i<turnos.size(); i++) {
			 if(turnos.get(i).getCliente().equals(cliente)) {
				 if(turnos.get(i).getFecha().isAfter(fechaultimomes)) {
					 turnossacados++;
				 }
			 }
		 }if(turnossacados>=1) {
			return true;
		 }else {
			 return false;
		 }
	}
	
	public void darDescuento(Cliente cliente) {
		if(clienteEsFrecuente(cliente)) {
			this.precio=(this.precio * cliente.getDescuento()) /100;
		}
	}
	
	public ArrayList<Peluquero> getPeluqueros() {
		return peluqueros;
	}

//	public void setPeluqueros(ArrayList<Peluquero> peluqueros) {
//		this.peluqueros = peluqueros;
//	}//NO SE HACE
	
	public void addPeluqueros(Peluquero p) {
		peluqueros.add(p);
	}

//	public ArrayList<Turno> getTurnos() {
//		return turnos;
//	}//NO SE HACE, ROMPE ENCAPSULAMIENTO
	
	public ArrayList<Turno> getTurnos(){
		 ArrayList<Turno> aux= new ArrayList<Turno>();
		 for(int i=0; i<turnos.size();i++) {
			 aux.add(turnos.get(i));
		 }return aux;
	}

	public void setTurnos(ArrayList<Turno> turnos) {
		this.turnos = turnos;
	}

	
	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
