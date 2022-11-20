package Ejercicio3;

public class EmpleadoExtras extends Empleado {
	
	private Integer horasextras;
	private final double monto = 10;

	public EmpleadoExtras(String nombre, double sueldo, Integer horasextras) {
		super(nombre, sueldo);
		this.horasextras = horasextras;
	}
	
	
	public double getSueldo() {
		return super.getSueldo()+(this.horasextras * monto);
	}


	public Integer getHorasextras() {
		return horasextras;
	}


	public void setHorasextras(Integer horasextras) {
		this.horasextras = horasextras;
	}


	public double getMonto() {
		return monto;
	}
	
	
		
	
	
	
}
