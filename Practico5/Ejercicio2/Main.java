package Ejercicio2;

public class Main {
	public static void main (String []args) {
		Casa c1 = new Casa("Griffindor", 3);
		Casa c2 = new CasaEnemistada("Slithering", 2, c1);
		CasaEnemistada c5 = new CasaEnemistada("Slithering", 2, c1);
		Casa c3 = new CasaExigente("Huffelpuf", 4 );
		CasaExigente c6 = new CasaExigente("Huffelpuf", 4 );
		Casa c4 = new Casa("Ravenclau", 3);
		
		Alumno a1 = new Alumno("Juan", c1);
		Alumno a2 = new Alumno("Martin", c2);
		Alumno a3 = new Alumno("Sofia", c1);
		Alumno a4 = new Alumno("Nicolas", c3);
		Alumno a5 = new Alumno("Juan", c4);

		c1.addCualidad("Correr");
		c1.addCualidad("Surfear");
		c1.addCualidad("Pelear");
		c1.addCualidad("Distraer");
		c1.addCualidad("Caminar");
		
		a5.addCualidad("Correr");
		a5.addCualidad("Surfear");
		a5.addCualidad("Pelear");
		a5.addCualidad("Caminar");
		a5.addCualidad("Distraer");
		
		c1.addAlumno(a5);
		
		c2.addCualidad("Pelear");
		c2.addCualidad("Amarrar");
		c5.addCualidad("Pelear");
		c5.addCualidad("Amarrar");
		
		a3.addCualidad("Pelear");
		a3.addCualidad("Amarrar");
		
		a2.addCualidad("Pelear");
		a2.addCualidad("Amarrar");
		
		c6.addCualidad("Copiar");
		c6.addCualidad("Comer");
		
		a1.addCualidad("Copiar");
		a1.addCualidad("Comer");
		a1.addFalimiar("Pepito");
		a1.addFalimiar("Juan");
		
		a4.addFalimiar("Juan");
		
		c6.addIntegrante("Pepito");
		
		System.out.println(c6.cumpleCondicion(a4));
		
		
		
//		System.out.println(c5.cumpleCondicion(a2));
		
//		System.out.println(c1.tieneCualidades(a5));
//		System.out.println(c1.toString());
				

	}
}
