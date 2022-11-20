package Practico2.Ejercicio1;

public class Episodio {
		private String titulo;
		private String descripcion;
		private boolean visto;
		private int Calificacion;
		
		
		public Episodio(String titulo, String descripcion ) {
			this.setTitulo(titulo);
			this.setDescripcion(descripcion);
			this.visto= false;
			this.Calificacion=0;
		}

		public Episodio(String titulo, String descripcion, boolean visto, int calificacion ) {
			this.setTitulo(titulo);
			this.setDescripcion(descripcion);
			this.visto= visto;
			this.Calificacion=setCalificacion(calificacion);
		}
		
		public int getCalificacion() {
			if (this.visto) {
				return this.Calificacion;
			} else {
				return -1;
			}
		}
	
		public boolean getVisto() {
			return this.visto;
		}

		public int setCalificacion(int calificacion) {
			if (calificacion>0 && calificacion < 6) {
				this.Calificacion = calificacion;
			}
			else {
				System.out.println("ERROR");
			}
			return calificacion;
		}
		

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		
	
}
