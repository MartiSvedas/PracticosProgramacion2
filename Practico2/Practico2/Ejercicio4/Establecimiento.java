package Practico2.Ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Establecimiento {
	
	private String nombre;
	private ArrayList <Cancha> canchas;
	private ArrayList <Turno> turnos;
	private double descuento ;
	
	
	public Establecimiento (String nombre, ArrayList<Turno>turnos, ArrayList<Cancha> canchas,  double descuento) {
		this.nombre= nombre;
		this.canchas=canchas;
		this.turnos=turnos;
		this.descuento=0.1;
	}
	
	public void darDescuento() {
		int precio=0;
		for(int i=0; i<turnos.size();i++) {
			if(Usuarioessocio(turnos.get(i).getUsuario())) {
				precio= (int) (canchas.get(i).getPrecio() * this.descuento);
				canchas.get(i).setPrecio(precio);
			}
		}
	}
	
	public boolean Usuarioessocio(Usuario usuario) { //MAL, VER EJERCICIO 5
		int contador=0;
		LocalDate hoy= LocalDate.now();
		for(int i=0; i<turnos.size();i++) {
			if(turnos.get(i).getFecha().getDayOfYear()-hoy.getDayOfYear()<=60) {
				contador++;
			}
		}if(contador>=4) {
			return true;
		}else {
			return false;
		}
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Cancha> getCanchas() {
		return canchas;
	}

	public void setCanchas(ArrayList<Cancha> canchas) {
		this.canchas = canchas;
	}

	public ArrayList<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(ArrayList<Turno> turnos) {
		this.turnos = turnos;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
}
