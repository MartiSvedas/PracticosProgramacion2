package Practico2.Ejercicio4;

import java.time.LocalDate;

public class Turno {
	
	private Usuario usuario;
	private LocalDate fecha;
	
	public Turno(Usuario usuario, LocalDate fecha ) {
		this.usuario= usuario;
		this.fecha=fecha;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
}
