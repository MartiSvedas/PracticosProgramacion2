package Practico1;


public class PersonaMain {
//	public static void main (String[]args) {
//		Persona p=new Persona(4,"Carlos","Gomez",LocalDate.of(2020,5,20 ));
//		System.out.println(p.mostrarInfo());
//		System.out.println(p.EsMayor());
//
//	}
	//OTRA FORMA DE MOSTRAR 
	
	public static void mostrarDatos(Persona p) {
		System.out.println(p.mostrarInfo());
	}
	public static void main(String[]args) {
		Persona p1= new Persona(4);
		mostrarDatos(p1);
		
	}
}
