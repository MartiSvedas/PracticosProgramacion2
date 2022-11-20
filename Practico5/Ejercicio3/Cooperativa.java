package Ejercicio3;

import java.util.ArrayList;

public class Cooperativa {
	String nombre;
	ArrayList <String> mineralesPrimarios;
	ArrayList <String> mineralesSecundarios;
	ArrayList <Lote> lotesEspeciales;
	ArrayList <Lote> lotesComun;

	
	public Cooperativa(String nombre) {
		this.nombre = nombre;
		this.mineralesPrimarios = new ArrayList <>();
		this.mineralesSecundarios = new ArrayList <>();
		this.lotesEspeciales = new ArrayList <>();
		this.lotesComun = new ArrayList <>();
	}
	
	public boolean esEspecial(Lote l) {
		boolean especial=false;
		for(int i=0; i<mineralesPrimarios.size();i++) {
			if(l.tieneMineral(mineralesPrimarios.get(i))) {
				especial=true;
			}else {
				especial=false;
			}
		}return especial;
	}
	
	public boolean esComun(Lote l) {
		int i=0;
		while(i<mineralesSecundarios.size()&& l.tieneMineral(mineralesSecundarios.get(i))) {
			i++;
		}
		return i==mineralesSecundarios.size();
	}
	
	public void addmineralesSec(String m) {
		mineralesSecundarios.add(m);
	}
	
	public void addmineralesPrim(String m) {
		mineralesPrimarios.add(m);
	}
	
	public void addLoteEspecial(Lote l) {
		if(esEspecial(l)) {			
			lotesEspeciales.add(l);
		}
	}
	
	public void addLoteComun(Lote l) {
		if(esComun(l)) {			
			lotesComun.add(l);
		}
	}

	@Override
	public String toString() {
		return "Cooperativa [nombre=" + nombre + ", mineralesPrimarios=" + mineralesPrimarios
				+ ", mineralesSecundarios=" + mineralesSecundarios + ", lotesEspeciales=" + lotesEspeciales
				+ ", lotesComun=" + lotesComun + "]";
	}
	
	

}
