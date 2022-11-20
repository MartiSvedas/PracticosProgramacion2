package Ejercicio5;

import java.time.LocalDate;

public class CongeladoNitrogeno extends ProductoRefrigerado {
	String metodocongelacion;
	double tiempoexpocision;
	
	public CongeladoNitrogeno(LocalDate fechavec, Integer nrolote, LocalDate fechaenvasado, String granjaorigen,
			Integer codOrganismo, double tempmantenimiento, String metodocongelacion, double tiempoexpocision) {
		super(fechavec, nrolote, fechaenvasado, granjaorigen, codOrganismo, tempmantenimiento);
		this.metodocongelacion = metodocongelacion;
		this.tiempoexpocision = tiempoexpocision;
	}

	public String getMetodocongelacion() {
		return metodocongelacion;
	}

	public void setMetodocongelacion(String metodocongelacion) {
		this.metodocongelacion = metodocongelacion;
	}

	public double getTiempoexpocision() {
		return tiempoexpocision;
	}

	public void setTiempoexpocision(double tiempoexpocision) {
		this.tiempoexpocision = tiempoexpocision;
	}

	@Override
	public String toString() {
		return super.toString() + " CongeladoNitrogeno [metodocongelacion=" + metodocongelacion + ", tiempoexpocision=" + tiempoexpocision
				+ "]";
	}
	
	
	
}
