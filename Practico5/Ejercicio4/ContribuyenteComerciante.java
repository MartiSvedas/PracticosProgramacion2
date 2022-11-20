package Ejercicio4;

public class ContribuyenteComerciante extends Contribuyente {
	
	double montoFactVentas;

	public ContribuyenteComerciante(String nombre, Integer codTributaria, double monto, double montoFact) {
		super(nombre, codTributaria, monto);
		this.montoFactVentas=montoFact;
	}
	
	public double getMonto() {
		return (super.getMonto())/2 + (3.5 * montoFactVentas) /100;
	}
	

}
