package Ejercicio5;

public class EmpleadoVenta extends EmpleadoFijo {
	
	Integer ventas;
	private Integer extra;
	
	public EmpleadoVenta(String nombre, String apellido, Integer dNI, double sueldo, Integer ventas, Integer extra) {
		super(nombre, apellido, dNI, sueldo);
		this.ventas = ventas;
		this.extra=extra;
	}

	public double getSueldo() {
		return super.getSueldo() + (this.extra * this.ventas);
	}

	public void setVentas(Integer ventas) {
		this.ventas = ventas;
	}

	public void setExtra(Integer extra) {
		this.extra = extra;
	}

	@Override
	public String toString() {
		return super.toString() + " EmpleadoVenta [ventas=" + ventas + ", extra=" + extra + "]";
	}


	
	
	

}
