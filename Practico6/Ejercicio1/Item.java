package Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Item {
	
	String nombre;
	LocalDate fechaAlquiler;
	ArrayList <Cliente> clientes;
	LocalDate fechaLimite;
	
	
	public Item(String nombre) {
		super();
		this.nombre=nombre;
	}

	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public void setFechaLimite(LocalDate fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public void addCliente(Cliente c) {
		clientes.add(c);
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}

	public LocalDate getFechaLimite() {
		return fechaLimite;
	}

	public void alquilar(Cliente c) {
		this.setFechaAlquiler(LocalDate.now());
		this.addCliente(c);
		this.setFechaLimite(this.fechaAlquiler.plusWeeks(2));
	}

	public abstract boolean puedeAlquilarse(Cliente c) ;

}
