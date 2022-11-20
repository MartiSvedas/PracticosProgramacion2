package Ejercicio3;

public class EmpleadoComision extends Empleado {
	
	private Integer cantVentas;
	private  final double porcentaje=0.1;
	
	public EmpleadoComision(String nombre, double sueldo, Integer cantVentas) {
		super(nombre, sueldo);
		this.cantVentas = cantVentas;
	}
	
	public double getSueldo() {
		return super.getSueldo() + (this.cantVentas*this.porcentaje);
	}

	public Integer getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(Integer cantVentas) {
		this.cantVentas = cantVentas;
	}
	
	

}
