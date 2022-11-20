package Ejercicio3;

public class Barco extends Elemento{
	double capacidad;
	
	public Barco (double capacidad) {
		this.capacidad=capacidad;
	}

	public double getCapacidad() {
		return capacidad;
	}

	@Override
	public boolean esMayor(Elemento o) {
		return this.capacidad > ((Barco) o).getCapacidad();
	}
	
	public void agregarCamion(Camion c) {
		System.out.println("Camion agregado");
	}
	
}
