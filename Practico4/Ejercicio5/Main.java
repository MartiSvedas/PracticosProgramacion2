package Ejercicio5;

import java.time.LocalDate;

public class Main {
	public static void main (String []args) {
		Producto p= new Producto(LocalDate.of(1999, 05, 02),1,LocalDate.of(2000, 12, 03),"Pepito");
		ProductoRefrigerado pr= new ProductoRefrigerado(LocalDate.of(1999, 05, 02),1,LocalDate.of(2000, 12, 03),"Pepito",0,3.4);
		ProductoRefrigerado cn= new CongeladoNitrogeno(LocalDate.of(1999, 05, 02),1,LocalDate.of(2000, 12, 03),"Pepito",0,3.4,"Congelador",6.4);
		ProductoRefrigerado ca= new CongeladoAire(LocalDate.of(1999, 05, 02),1,LocalDate.of(2000, 12, 03),"Pepito",2,0.5,3.4,5.2,8.4,0.6);
		ProductoRefrigerado cag= new CongeladoAgua(LocalDate.of(1999, 05, 02),1,LocalDate.of(2000, 12, 03),"Pepito",3,4.5,"Limpio");
		Avicola a= new Avicola();
		
		System.out.println(p.toString());
		System.out.println(pr.toString());
		System.out.println(cn.toString());
		System.out.println(ca.toString());
		System.out.println(cag.toString());
		
		a.addProducto(p);
		
		System.out.println(a.toString());
	}
}
