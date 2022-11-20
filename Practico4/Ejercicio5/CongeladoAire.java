package Ejercicio5;

import java.time.LocalDate;

public class CongeladoAire extends ProductoRefrigerado {
	double cantnitrogeno;
	double cantoxigeno;
	double cantdioxidocarbono;
	double cantidadvaporagua;
	
	
	public CongeladoAire(LocalDate fechavec, Integer nrolote, LocalDate fechaenvasado, String granjaorigen,
			Integer codOrganismo, double tempmantenimiento, double cantnitrogeno, double cantoxigeno,
			double cantdioxidocarbono, double cantidadvaporagua) {
		super(fechavec, nrolote, fechaenvasado, granjaorigen, codOrganismo, tempmantenimiento);
		this.cantnitrogeno = cantnitrogeno;
		this.cantoxigeno = cantoxigeno;
		this.cantdioxidocarbono = cantdioxidocarbono;
		this.cantidadvaporagua = cantidadvaporagua;
	}


	public double getCantnitrogeno() {
		return cantnitrogeno;
	}


	public void setCantnitrogeno(double cantnitrogeno) {
		this.cantnitrogeno = cantnitrogeno;
	}


	public double getCantoxigeno() {
		return cantoxigeno;
	}


	public void setCantoxigeno(double cantoxigeno) {
		this.cantoxigeno = cantoxigeno;
	}


	public double getCantdioxidocarbono() {
		return cantdioxidocarbono;
	}


	public void setCantdioxidocarbono(double cantdioxidocarbono) {
		this.cantdioxidocarbono = cantdioxidocarbono;
	}


	public double getCantidadvaporagua() {
		return cantidadvaporagua;
	}


	public void setCantidadvaporagua(double cantidadvaporagua) {
		this.cantidadvaporagua = cantidadvaporagua;
	}


	@Override
	public String toString() {
		return super.toString() + " CongeladoAire [cantnitrogeno=" + cantnitrogeno + ", cantoxigeno=" + cantoxigeno
				+ ", cantdioxidocarbono=" + cantdioxidocarbono + ", cantidadvaporagua=" + cantidadvaporagua + "]";
	}
	
	
	
	
	
}
