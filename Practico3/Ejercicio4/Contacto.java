package Ejercicio4;

import java.time.LocalDate;
import java.time.Period;

public class Contacto {
	String nombre;
	String apellido;
	LocalDate fechanac;
	Integer telefono;
	String direccion;
	String direccionmail;
	String ciudad;
	public Contacto(String nombre, String apellido, LocalDate fechanac, Integer telefono, String direccion,
			String direccionmail, String ciudad) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechanac = fechanac;
		this.telefono = telefono;
		this.direccion = direccion;
		this.direccionmail = direccionmail;
		this.ciudad = ciudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechanac() {
		return fechanac;
	}
	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDireccionmail() {
		return direccionmail;
	}
	public void setDireccionmail(String direccionmail) {
		this.direccionmail = direccionmail;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public int getEdad() {
		LocalDate hoy= LocalDate.now();
		Period periodo = Period.between(this.fechanac, hoy);
		return periodo.getYears();
	}
	
	public boolean equals(Object o) {
		try {
		Contacto otro = (Contacto)o;
		if (this.apellido == (otro.getApellido()) && (this.nombre==(otro.getNombre())) 
				&& this.telefono==(otro.getTelefono()))
			return true;
		else
			return false;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	
	
}
