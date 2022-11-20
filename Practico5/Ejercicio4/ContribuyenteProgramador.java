package Ejercicio4;


public class ContribuyenteProgramador extends Contribuyente {
	
	double montoFactSoftware ;
	
	public ContribuyenteProgramador(String nombre, Integer codTributaria, double monto, double montoFact) {
		super(nombre, codTributaria, monto);
		this.montoFactSoftware=montoFact;
	}
	
	public double getMonto() {
		return ((super.getMonto()*20)/100)+(2*montoFactSoftware /100);
	}

	

}
