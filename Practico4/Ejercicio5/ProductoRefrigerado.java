package Ejercicio5;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
	
	Integer codOrganismo;
	double tempmantenimiento;
	
	
	public ProductoRefrigerado(LocalDate fechavec, Integer nrolote, LocalDate fechaenvasado, String granjaorigen,
			Integer codOrganismo, double tempmantenimiento) {
		
		super(fechavec, nrolote, fechaenvasado, granjaorigen);
		this.codOrganismo = codOrganismo;
		this.tempmantenimiento = tempmantenimiento;
	}


	public Integer getCodOrganismo() {
		return codOrganismo;
	}


	public void setCodOrganismo(Integer codOrganismo) {
		this.codOrganismo = codOrganismo;
	}


	public double getTempmantenimiento() {
		return tempmantenimiento;
	}


	public void setTempmantenimiento(double tempmantenimiento) {
		this.tempmantenimiento = tempmantenimiento;
	}


	@Override
	public String toString() {
		return super.toString() + " ProductoRefrigerado [codOrganismo=" + codOrganismo + ", tempmantenimiento=" + tempmantenimiento + "]";
	}
	
	
	

}
