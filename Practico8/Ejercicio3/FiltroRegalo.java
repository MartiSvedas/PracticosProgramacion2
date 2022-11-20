package Ejercicio3;

public class FiltroRegalo extends Filtro{
	
	private String regalo;
	
	public FiltroRegalo(String regalo) {
		this.regalo=regalo;
	}

	@Override
	public boolean cumple(Carta c) {
		return c.contieneRegalo(regalo);
	}

}
