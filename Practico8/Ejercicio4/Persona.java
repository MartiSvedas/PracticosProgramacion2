package Ejercicio4;

public class Persona {
	int dni;
	Voto voto;
	
	public Persona(int dni, Voto v) {
		super();
		this.dni = dni;
		this.voto=v;
	
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void votar(LugardeVoto lugar, Candidato c ) {
		if(lugar.puedeVotar(this)) {
			lugar.addVoto(this.voto, c);
		}
	}
	
	
	
}
