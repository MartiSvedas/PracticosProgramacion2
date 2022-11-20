package Ejercicio2;

public abstract class ElementoEnvio {
	int numeroTraking;
	
	public ElementoEnvio(int numeroTraking) {
		this.numeroTraking=numeroTraking;
	}
	
	public int getNumeroTraking() {
		return numeroTraking;
	}

	public void setNumeroTraking(int numeroTraking) {
		this.numeroTraking = numeroTraking;
	}

	public String getCiudadDestino() {
		return getDestinatario().getCiudad();
	}
	
	public abstract double getPeso();
	public abstract Persona getDestinatario();
	public abstract Persona getRemitente();

}
