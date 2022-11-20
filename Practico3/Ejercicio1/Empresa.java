package Ejercicio1;

import java.util.ArrayList;

public class Empresa {
		
		ArrayList<Encuesta> encuestas;
		ArrayList <Encuesta> encuestarealizada;
		double plus;
		
		public Empresa() {
			this.encuestas=new ArrayList<>();
			this.encuestarealizada=new ArrayList<>();
			this.plus = 20;
		}
		
		public void addEncuesta(Encuesta e) {
			if(!encuestas.contains(e)) {
				encuestas.add(e);
			}
		}
		
		public void addEncuestasrealizadas( Persona p) {
			for(int i=0;i<encuestas.size(); i++) {
				if(p.Respondio(encuestas.get(i))) {
					encuestarealizada.add(encuestas.get(i));
				}
			}
		}

		
		public int cantidadEncuestasRealizadas(Empleado e) {
			int cantEncuestas=0;
			for(int i=0;i<encuestas.size(); i++) {
				if(e.Realizo(encuestas.get(i))) {
					cantEncuestas++;	
				}
			}return cantEncuestas;
		}
		
		public void darPlus(Empleado e) {
		e.setSueldo(cantidadEncuestasRealizadas(e)*(e.getSueldo()*this.plus));
		}
		
		public double getPlus() {
			return plus;
		}

		
		
	
		
		
}
