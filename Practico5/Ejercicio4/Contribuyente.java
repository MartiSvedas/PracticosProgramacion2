package Ejercicio4;

public class Contribuyente {
	
	String nombre;
	Integer codTributaria;
	double monto;
	
	public Contribuyente(String nombre, Integer codTributaria, double monto) {
		this.nombre = nombre;
		this.codTributaria = codTributaria;
		this.monto=monto;
	}
	
	public boolean esContribuyente (Impuesto i) {
		return i.Contribuye(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodTributaria() {
		return codTributaria;
	}

	public void setCodTributaria(Integer codTributaria) {
		this.codTributaria = codTributaria;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	

	
}
