package Ejercicio2;

public class Proceso extends Elemento {
	double reqMemoria;

	public Proceso(double reqMemoria) {
		super();
		this.reqMemoria = reqMemoria;
	}

	public double getReqMemoria() {
		return reqMemoria;
	}

	public void setReqMemoria(double reqMemoria) {
		this.reqMemoria = reqMemoria;
	}
	
	public boolean esMayor(Elemento p) {
		return this.reqMemoria > ((Proceso)p).getReqMemoria();
	}
}
