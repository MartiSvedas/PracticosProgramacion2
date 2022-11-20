package Ejercicio5;

public class MainEj5 {
	public static void main(String[]args) {
		EmpleadoFijo e= new EmpleadoFijo ("Pedro", "Alvarez", 1547896, 10);
		EmpleadoFijo e2=new EmpleadoVenta("Juan","Suarez", 485965, 10 , 1, 10 );
		EmpleadoFijo e3=new EmpleadoBonos("Jose","Perez", 548965, 10,1, 100, 1);
		
		EmpresaFacturacion empresa= new EmpresaFacturacion();
		
		
		System.out.println(e.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
		empresa.addEmpleado(e);
		empresa.addEmpleado(e2);
		empresa.addEmpleado(e3);
		
		System.out.println(empresa.getTotalSueldo());
	}
}
