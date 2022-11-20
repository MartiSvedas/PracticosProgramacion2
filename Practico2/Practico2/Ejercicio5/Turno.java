package Practico2.Ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Turno {
	
	private Cliente cliente;
	private Peluquero peluquero;	;
	private LocalDate fecha;
	

	
	public Turno(Cliente cliente, Peluquero peluquero, LocalDate fecha ) {
		this.cliente= cliente;
		this.peluquero=peluquero;
		this.fecha=fecha;
	}


	public Turno() {
		// TODO Auto-generated constructor stub
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Peluquero getPeluquero() {
		return peluquero;
	}

	public void setPeluquero(Peluquero peluquero) {
		this.peluquero = peluquero;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	
}
