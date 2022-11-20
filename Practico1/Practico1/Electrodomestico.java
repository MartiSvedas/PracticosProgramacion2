package Practico1;

public class Electrodomestico {
	private String nombre;
	private double preciobase;
	private String color;
	private double consumo;
	private double peso;
	private static final double bajoconsumo=45;
	
	public Electrodomestico(String nombre) {
		this(nombre,"grisplata");
	}
	public Electrodomestico(String nombre, String color) {
		this(nombre, color, 10);
	}
	public Electrodomestico(String nombre, String color, double consumo) {
		this(nombre, color, consumo, 2);
	}
	public Electrodomestico(String nombre, String color, double consumo, double peso) {
		this(nombre, color, consumo, peso, 100);
	}
	public Electrodomestico(String nombre, String color, double consumo, double peso, double preciobase) {
		this.nombre=nombre;
		this.peso=peso;
		this.color=color;
		this.consumo=consumo;
		this.preciobase=preciobase;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPreciobase() {
		return preciobase;
	}
	public void setPreciobase(double preciobase) {
		this.preciobase = preciobase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public boolean Bajoconsumo() {
		return(consumo<bajoconsumo);
	}
	
	public double CalcularBalance() {
		double balance= this.preciobase/this.peso;
		return balance;
	}
	public String EsAltaGama() {
		double balance= CalcularBalance();
		if (balance>3) {
			return "es de alta gama";
		}else{
			return "no es de alta gama";
		}
	}
}
