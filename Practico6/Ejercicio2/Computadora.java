package Ejercicio2;

public class Computadora extends Elemento {
	double velocidad;

	public Computadora(double velocidad) {
		super();
		this.velocidad = velocidad;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	public void ejecutarProceso(Proceso p) {
		System.out.println("Ejecutando"+p);
	}

	@Override
	public boolean esMayor(Elemento o) {
		return this.velocidad >((Computadora) o).getVelocidad();

	}
	
}
