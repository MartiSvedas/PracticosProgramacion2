package Ejercicio1;

public class ArchivoComprimido extends Directorio {
	
	private double compresion;

	public ArchivoComprimido(String nombre, double compresion) {
		super(nombre);
		this.compresion=compresion;
	}

	public double getCompresion() {
		return compresion;
	}

	public void setCompresion(double compresion) {
		this.compresion = compresion;
	}
	
	public double getTamanio() {
		return super.getTamanio()*this.compresion;
	}
	
	
}
