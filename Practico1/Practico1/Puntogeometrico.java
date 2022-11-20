package Practico1;

public class Puntogeometrico {
	private double X;
	private double Y;
	
	public Puntogeometrico(double x,double y) {
		this.X=x;
		this.Y=y;
	}
	
	public double getX() {
		return X;
	}

	public void setX(double x) {
		this.X = x;
	}

	public double getY() {
		return Y;
	}

	public void setY(double y) {
		this.Y = y;
	}
	public void desplazarPunto(double desX, double desY) {
		X += desX;
		Y += desY;
	}
	public double calcularDistanciaEuclidea(double X2, double Y2) {
		double distancia= Math.sqrt(Math.pow(this.X-X2, 2))+Math.sqrt( Math.pow(this.Y-Y2, 2)) ;
		return Math.sqrt(distancia);
		
		
		
	}
	
}
