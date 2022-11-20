package Ejercicio4;

public class FiltroCandidato extends Filtro {
	private Candidato c;
	
	public FiltroCandidato(Candidato c) {
		this.c=c;
	}
	@Override
	public boolean cumple(Voto v) {
		return v.getCandidato().equals(c);
	}

}
