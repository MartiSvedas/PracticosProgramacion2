package Practico2Ejercicio2;

public class Participante {
		private String nombre;
		private long telefono;
		private String email;
		
		public Participante(long telefono, String email, String nombre) {
			this.telefono=telefono;
			this.email=email;
			this.nombre=nombre;
		}

		public long getTelefono() {
			return telefono;
		}

		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

	

}
