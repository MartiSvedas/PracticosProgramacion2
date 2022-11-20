package Ejercicio1;

public class Main {
	public static void main(String[]args) {
		Persona p1= new Persona (5);
		Persona p2=new Persona(6);
		Encuesta e1= new Encuesta();
		Encuesta e2= new Encuesta();
		e1.addDNIpersona(p1);
		e2.addDNIpersona(p2);
		Empleado em1=new Empleado(3,200);
		em1.addEncuesta(e2);	
		em1.addEncuesta(e1);
		Empresa empresa = new Empresa();
		empresa.addEncuesta(e1);
		empresa.addEncuesta(e2);
		empresa.darPlus(em1);
		empresa.cantidadEncuestasRealizadas(em1);
		System.out.println(empresa.cantidadEncuestasRealizadas(em1));
		System.out.println(em1.getSueldo());
	}
}
