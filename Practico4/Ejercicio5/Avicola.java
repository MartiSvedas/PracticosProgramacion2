package Ejercicio5;

import java.util.ArrayList;

public class Avicola {
	ArrayList <Producto> productos;

	public Avicola() {
		this.productos = new ArrayList <>();
	}
	
	public void addProducto(Producto p) {
		productos.add(p);
	}

	@Override
	public String toString() {
		return "Avicola [productos=" + productos + "]";
	}

	
	
}
