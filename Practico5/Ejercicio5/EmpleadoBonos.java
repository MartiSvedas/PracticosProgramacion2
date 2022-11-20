package Ejercicio5;

public class EmpleadoBonos extends EmpleadoFijo {
	Integer bono, ventas, minventas;

	public EmpleadoBonos(String nombre, String apellido, Integer dNI, double sueldo,Integer ventas, Integer bono, Integer minventas) {
		super(nombre, apellido, dNI, sueldo);
		this.bono = bono;
		this.ventas= ventas;
		this.minventas=minventas;
	}
	
	public double getSueldo() {
		double total=0;
		if(this.ventas>=this.minventas) 
			total=super.getSueldo() + this.bono;
		
		return total;
	}
	

	public void setBono(Integer bono) {
		this.bono = bono;
	}

	public void setVentas(Integer ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return super.toString() + " EmpleadoBonos [bono=" + bono + ", ventas=" + ventas + ", minventas=" + minventas + "]";
	}
	
	
}
