package Ejercicio2;

public class Paquete extends ElementoEnvio {
	private Persona destinatario;
	private Persona remitente;
	private double peso;
	private boolean retiroSucursal;
	
	
	public Paquete(int numeroTraking, Persona destinatario,Persona remitente, double peso, boolean retiroSucursal ) {
		super(numeroTraking);
		this.destinatario=destinatario;
		this.remitente=remitente;
		this.peso=peso;
		this.retiroSucursal=retiroSucursal;
	}
	
	public boolean isRetiroSucursal() {
		return retiroSucursal;
	}

	public void setRetiroSucursal(boolean retiroSucursal) {
		this.retiroSucursal = retiroSucursal;
	}

	@Override
	public double getPeso() {
		return this.peso;
	}
	@Override
	public Persona getDestinatario() {
		return this.destinatario;
	}
	@Override
	public Persona getRemitente() {
		return this.remitente;
	}
	
	
}
