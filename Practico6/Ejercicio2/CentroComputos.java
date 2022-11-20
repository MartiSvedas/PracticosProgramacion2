package Ejercicio2;


public class CentroComputos {
	public Ordenados computadoras;
	public Ordenados procesos;
	
	
	public CentroComputos() {
		this.computadoras = new Ordenados();
		this.procesos = new Ordenados();
	}
	
	public void ejecutarProcesoOrdenado() {
		if(computadoras.tieneElementos()) {
			Computadora c1= (Computadora) computadoras.siguiente();
			c1.ejecutarProceso((Proceso)procesos.siguiente());
		}
	}
	
	public void agregarProceso(Proceso p) {
		procesos.addelemento(p);
	}
	
	public void agregarComputadora( Computadora c) {
		computadoras.addelemento(c);
	}
	
	
}
