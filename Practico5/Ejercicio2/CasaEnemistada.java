package Ejercicio2;

public class CasaEnemistada extends Casa {
	
	private Casa casaEnemiga;
		
	public CasaEnemistada(String nombre,int cantMax, Casa casaEnemiga) {
		super(nombre,cantMax);
		this.casaEnemiga= casaEnemiga;
	}
	
	public boolean cumpleCondicion(Alumno a) {
		boolean tieneCualidades = super.tieneCualidades(a);
		if(tieneCualidades) {
			if(a.getCasa().equals(this.casaEnemiga)) {
				return false;
			}else {
				return true;
			}
		}else {
			return false;
		}
	}

}
