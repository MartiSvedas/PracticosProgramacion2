package Practico1;

public class ElectrodomesticoMain {
	public static void imprimir(Electrodomestico e) {
		System.out.println("El electrodomestico " + e.getNombre() 
		+ " cuyo precio es "+ e.getPreciobase()+ " cuyo color es " + e.getColor() +
		", cuyo consumo energetico es "+ e.getConsumo() +",cuyo peso es de " + e.getPeso()
		+", cuyo balance es de "+ e.CalcularBalance()+ " y " + e.EsAltaGama()+ 
		" es de bajo consumo " + e.Bajoconsumo());
	}
	public static void main(String[]args) {
		Electrodomestico e = new Electrodomestico("Heladera","verde", 500, 1000);
		imprimir(e);
	}
}
