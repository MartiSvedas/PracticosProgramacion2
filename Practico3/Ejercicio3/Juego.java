package Ejercicio3;

public class Juego {
	
	Personaje p1, p2;

	public Juego(Personaje p1, Personaje p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Personaje getP1() {
		return p1;
	}

	public void setP1(Personaje p1) {
		this.p1 = p1;
	}

	public Personaje getP2() {
		return p2;
	}

	public void setP2(Personaje p2) {
		this.p2 = p2;
	}
	
	public void jugar(Cualidad c1, Cualidad c2) {
		
		if(this.p1.getNivel(c1)<this.p2.getNivel(c2)) {
			System.out.println("ganador participante 2:" + this.p2.getNombre());
			
		}else if(this.p1.getNivel(c1)>this.p2.getNivel(c2)) {
			System.out.println("ganador participante 1:" + this.p1.getNombre());
			
		}else if(this.p1.getNivel(c1)==this.p2.getNivel(c2)){
			System.out.println("empate, ganador el mayor valor de otra cualidad:");
			getOtraCualidad();
		}
		}
	
	public void getOtraCualidad() {
		
		if(this.p1.getNivelOtraCualidad()>this.p2.getNivelOtraCualidad()){
			System.out.println("ganador participante 1 :" + this.p1.getNombre());
			
		}else {
			System.out.println("ganador participante 2:" + this.p2.getNombre());
		}
	}


	
	
	
	
	
}
