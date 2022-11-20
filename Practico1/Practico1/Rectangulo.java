package Practico1;

public class Rectangulo {
	private  Puntogeometrico p1 ;
	private  Puntogeometrico p2;
	private Puntogeometrico p3;
	private Puntogeometrico p4;
	
	 //p1 es (X,Y)
	//p2 es (X,Y)
	public Rectangulo(Puntogeometrico p1, Puntogeometrico p2, Puntogeometrico p3, Puntogeometrico p4) {
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
		this.p4=p4;
	}
	
	public Puntogeometrico getP3() {
		return p3;
	}
	public void setP3(Puntogeometrico p3) {
		this.p3 = p3;
	}
	public Puntogeometrico getP4() {
		return p4;
	}
	public void setP4(Puntogeometrico p4) {
		this.p4 = p4;
	}
	public void setp1 (Puntogeometrico p1) {
		this.p1=p1;
	}
	public Puntogeometrico getP2() {
		return p2;
	}
	public void setP2(Puntogeometrico p2) {
		this.p2 = p2;
	}
	public Puntogeometrico getP1() {
		return p1;
	}
	public void Desplazar(double X, double Y) {
		this.p1.desplazarPunto(X, Y);
		this.p2.desplazarPunto(X, Y);
		this.p3.desplazarPunto(X, Y);
		this.p4.desplazarPunto(X, Y);
	}
	
	public double CalcularArea() {
		double area = this.p2.getX()-this.p1.getX() * this.p2.getY() - this.p1.getY();
		return area;
	}
	
	public int Comparar( Rectangulo rectangulo2) {
		double area1 = this.CalcularArea();
		double area2 = rectangulo2.CalcularArea();
		if(area1>area2) {
			return 1;
		}else if(area1==area2) {
			return 0;
		}else{
			return-1;
		}
	}
		
	public boolean EsCuadrado() {
		return (p2.getX()-p1.getX()) == (p2.getY() - p1.getY());
	}
	
	public double Largoladosup() {
		return p4.getX()-p3.getX() ;
	}
	public String Estaacostadoparado() {
		if(p2.getX()-p1.getX()<p2.getY() - p1.getY()) {
			return "Esta parado";
		}else {
			return "Esta acostado";
		}
		
	}
	
	
}
