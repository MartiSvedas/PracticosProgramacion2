package Ejercicio3;

public class Cualidad {
	
	String poder;
	Integer nivel;
	
	public Cualidad(String poder, Integer nivel) {
		this.poder = poder;
		this.nivel = nivel;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		if(poder=="Vision Nocturna"|| poder == "Velocidad" || poder == "Fuerza"|| poder == "Peso"|| poder =="Altura" || poder == "Edad") {
		this.poder = poder; }
		else {
			System.out.println("No existe ese poder");
		}
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	
	
}
