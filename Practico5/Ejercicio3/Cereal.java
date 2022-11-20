package Ejercicio3;

import java.util.ArrayList;

public class Cereal {
		String nombre;
		ArrayList <String> minerales;
		
		public Cereal (String nombre) {
			this.nombre=nombre;
			this.minerales= new ArrayList <>();
		}
		
		public boolean puedeSembrarse(Lote l) {
			int i=0; 
			while(i<minerales.size() && l.tieneMineral(minerales.get(i))) {
				i++;
			}
			return minerales.size()==i;
			
		}
		
		public void addminerales(String m) {
			minerales.add(m);
		}

		@Override
		public String toString() {
			return "Cereal [nombre=" + nombre + ", minerales=" + minerales + "]";
		}
		
		
		
}
