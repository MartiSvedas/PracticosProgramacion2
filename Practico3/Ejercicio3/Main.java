package Ejercicio3;

public class Main {
	public static void main (String []args) {
		Cualidad c1= new Cualidad( "Velocidad", 200);
		Cualidad c2= new Cualidad("Velocidad", 200);
		Cualidad c3= new Cualidad("Fuerza",200);
		Cualidad c4= new Cualidad("Fuerza",200);
		Cualidad c5= new Cualidad("Altura",500);
		Cualidad c6= new Cualidad("Altura",800);
		Personaje p1= new Personaje("Pedro","Superman");
		Personaje p2=new Personaje("Juan","Batman");
		p2.addCualidad(c2);
		p2.addCualidad(c3);
		p2.addCualidad(c6);
		p1.addCualidad(c1);
		p1.addCualidad(c4);
		p1.addCualidad(c5);
		Juego j1= new Juego(p1,p2);
		j1.jugar(c1, c2);
		
	}
}
