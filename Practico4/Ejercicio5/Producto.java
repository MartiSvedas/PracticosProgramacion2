package Ejercicio5;

import java.time.LocalDate;

public class Producto {
	LocalDate fechavec;
	Integer nrolote;
	LocalDate fechaenvasado;
	String granjaorigen;
	
	
	public Producto(LocalDate fechavec, Integer nrolote, LocalDate fechaenvasado, String granjaorigen) {
		
		this.fechavec = fechavec;
		this.nrolote = nrolote;
		this.fechaenvasado = fechaenvasado;
		this.granjaorigen = granjaorigen;
	}


	public LocalDate getFechavec() {
		return fechavec;
	}


	public void setFechavec(LocalDate fechavec) {
		this.fechavec = fechavec;
	}


	public Integer getNrolote() {
		return nrolote;
	}


	public void setNrolote(Integer nrolote) {
		this.nrolote = nrolote;
	}


	public LocalDate getFechaenvasado() {
		return fechaenvasado;
	}


	public void setFechaenvasado(LocalDate fechaenvasado) {
		this.fechaenvasado = fechaenvasado;
	}


	public String getGranjaorigen() {
		return granjaorigen;
	}


	public void setGranjaorigen(String granjaorigen) {
		this.granjaorigen = granjaorigen;
	}


	@Override
	public String toString() {
		return "Producto [fechavec=" + fechavec + ", nrolote=" + nrolote + ", fechaenvasado=" + fechaenvasado
				+ ", granjaorigen=" + granjaorigen + "]";
	}
	
	
	
	
}
