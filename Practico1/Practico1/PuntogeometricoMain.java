package Practico1;

public class PuntogeometricoMain {
	public static void imprimir(Puntogeometrico p,double x2,double y2) {
		System.out.println("el valor de la euclidea es" + p.calcularDistanciaEuclidea(x2,y2)
		+"X1 =" + p.getX() + "Y1="+ p.getY() + "X2 =" + x2 + "y2=" + y2);
	}
	public static void main (String[]args) {
		Puntogeometrico p= new Puntogeometrico(0,0);
		p.setX(20);
		p.setY(15);
		imprimir(p,10,10);
		
	}
}
