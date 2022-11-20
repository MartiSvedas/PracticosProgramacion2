package Practico1;

public class RectanguloMain {
	public static void imprimir(Rectangulo r,Rectangulo r2) {
		System.out.println("El area del rectangulo es"+ r.CalcularArea() + "Son iguales" 
	+ r.Comparar(r2) );
	}
	public static void main (String[]args) {
		Puntogeometrico p1= new Puntogeometrico(1,1);
		Puntogeometrico p2= new Puntogeometrico(1,2);
		Puntogeometrico p3= new Puntogeometrico(2,1);
		Puntogeometrico p4= new Puntogeometrico(2,2);
		Puntogeometrico p5= new Puntogeometrico(1,1);
		Puntogeometrico p6= new Puntogeometrico(1,3);
		Puntogeometrico p7= new Puntogeometrico(3,1);
		Puntogeometrico p8= new Puntogeometrico(3,3);
		Rectangulo r1= new Rectangulo(p1,p2,p3,p4);
		Rectangulo r2= new Rectangulo(p5,p6,p7,p8);
		imprimir(r1,r2);
	}
}
