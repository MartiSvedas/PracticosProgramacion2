package Ejercicio5;

import java.util.ArrayList;

public class EmpresaFacturacion {
	ArrayList <EmpleadoFijo> empleado;
	
	public EmpresaFacturacion() {
		empleado= new ArrayList <>();
	}
	
	public void addEmpleado(EmpleadoFijo e) {
		empleado.add(e);
	}
	
	public double getTotalSueldo() {
		double total=0;
		for(int i=0; i<empleado.size();i++) {
			total= empleado.get(i).getSueldo();
		}
		return total;
	}
}
