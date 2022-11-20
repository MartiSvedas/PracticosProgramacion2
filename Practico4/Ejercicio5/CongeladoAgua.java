package Ejercicio5;

import java.time.LocalDate;

public class CongeladoAgua extends ProductoRefrigerado {
	
	String infosanidad;

	public CongeladoAgua(LocalDate fechavec, Integer nrolote, LocalDate fechaenvasado, String granjaorigen,
			Integer codOrganismo, double tempmantenimiento, String infosanidad) {
		super(fechavec, nrolote, fechaenvasado, granjaorigen, codOrganismo, tempmantenimiento);
		this.infosanidad = infosanidad;
	}

	public String getInfosanidad() {
		return infosanidad;
	}

	public void setInfosanidad(String infosanidad) {
		this.infosanidad = infosanidad;
	}

	@Override
	public String toString() {
		return super.toString() + " CongeladoAgua [infosanidad=" + infosanidad + "]";
	}
	
	

}
