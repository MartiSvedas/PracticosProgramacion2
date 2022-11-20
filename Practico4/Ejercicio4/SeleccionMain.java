package Ejercicio4;

import java.time.LocalDate;

public class SeleccionMain {
	public static void main (String []args) {
		Contingente c1= new Contingente ("Pedro","Suzano",0, LocalDate.of(1997, 04, 29), false, false);
		Masajista c2= new Masajista ("Lucas","Susan",2, LocalDate.of(1943, 06, 19), true, false,"fisio", 0);
		Futbolista c3= new Futbolista ("Pepe","Perez",3, LocalDate.of(1992, 07, 04), false, true,"Central", 'L' , 2);
		Entrenador c4= new Entrenador ("Chino","Suza",4, LocalDate.of(1998, 01, 02), true, true, 0);
		
		Seleccion s=new Seleccion();
		s.addContingente(c1);
		s.addContingente(c4);
		s.addContingente(c2);
		s.addContingente(c3);
				
		System.out.println(s.getEstado(c1));
		System.out.println(s.getEstado(c2));
		System.out.println(s.getEstado(c3));
		System.out.println(s.getEstado(c4));

	}
	
	


}
