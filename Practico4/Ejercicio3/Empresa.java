package Ejercicio3;

import java.util.ArrayList;

import Ejercicio5.EmpleadoFijo;

public class Empresa {
	
	ArrayList <EmpleadoFijo> empleados;

	public Empresa() {
		this.empleados = new ArrayList <>();
	}
	
	public double getSueldoEmpleado(EmpleadoFijo e) {
		double sueldo=0;
		for(int i=0; i<empleados.size(); i++) {
			if(empleados.contains(e)) {
				sueldo = e.getSueldo();
			}else {
				System.out.println("No existe empleado");
			}
		}return sueldo;
	}
	
	public void addEmpleado(EmpleadoFijo e) {
		empleados.add(e);
	}
	
	
}
