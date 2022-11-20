package Ejercicio2;

import java.util.ArrayList;

public class Fabrica {
	ArrayList <Producto> productos;
	ArrayList <Producto> productos_stock;
	double porcventa;
	
	
	public Fabrica(double porcventa) {
		this.porcventa=35;
		this.productos=new ArrayList <>();
		this.productos_stock=new ArrayList<>();
		}
	
	public void addproductostock(Producto p) {
		if(!productos_stock.contains(p)) {
			productos_stock.add(p);
		}
	}
	
	public void setvalorVenta(Producto p) {
		if(productos_stock.contains(p)) {
			p.setValorventa((p.getCostofabricacion()*this.porcventa)/100);
			}
	}

	
	
}
