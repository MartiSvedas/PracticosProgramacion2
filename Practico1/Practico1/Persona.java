package Practico1;

import java.time.LocalDate;

public class Persona {
	private String nombre, apellido;
	private int edad;
	private LocalDate fnac;
	private long dni;
	private String sexo;
	private double peso, altura;
	private double Imc;
	private static final double minimoMasa = 18.5;//contante 
	private static final double maxMasa = 25;//contante
	private static final double edadMax=18;
	private static final double edadMaxVotar=16;
	
	public Persona (long dni) {
		this.dni=dni;//valor obligatorio
		fnac = LocalDate.of(2000,1,1);
		nombre="N";
		apellido="N";
		peso=1;
		altura=1;
		sexo="femenino";
	}
	public Persona (long dni, String nombre, String apellido) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		fnac = LocalDate.of(2000,1,1);
		peso=1;
		altura=1;
		sexo="femenino";
	}
	public Persona(long dni, String nombre, String apellido, LocalDate fnac) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.fnac = fnac;
		peso=1;
		altura=1;
		sexo="femenino";
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public LocalDate getFnac() {
		return fnac;
	}
	public void setFnac(LocalDate fnac) {
		this.fnac = fnac;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public long getDni() {
		return dni;
	}
	
	//Calculo del indice de masa corporal 
	public double IMcorporal() {
		Imc= (peso/(altura*altura));
		return Imc;
	}
	//Saber si esta en forma
	public boolean EstaenForma() {
		return ((Imc<maxMasa) && (Imc>minimoMasa));
	}
//	Otra forma
//	public boolean EstaenForma() {
//		double masa= IMcorporal();
//		return ((masa>minimoMasa)&&(masa<maxMasa));
//	}
	
	//Saber si cumple años
	public boolean CumpleAños() {
		LocalDate hoy = LocalDate.now();
		
		if((hoy.getMonthValue()== fnac.getMonthValue())&&
				(hoy.getDayOfMonth()==fnac.getDayOfMonth())){
			return true;
		}else {
			return false;
		}
	}
	
	//Saber si es mayor de edad
	public int CalcularEdad() {
		this.fnac=getFnac();
		edad=getEdad();
		LocalDate hoy = LocalDate.now();
		int dif= hoy.getYear() - fnac.getYear();
		//compruebo que sea coherente, si el mes y dia de nacimiento es
		//mayor o igual a la fecha actual entonces la edad seria sumado dif+1;
			if(hoy.getMonthValue()>=fnac.getMonthValue()) {
				if(hoy.getDayOfMonth()>=fnac.getDayOfMonth()) {
					edad=dif;
				}else {
					edad=dif+1;
				}
		}
		return edad;
	}
	public boolean EsMayor() {
		if(edad>=edadMax) {
			return true;
		}else {
			return false;
		}
		
	}
	//saber si puede votar
	public boolean PuedeVotar() {
		if(edad>=edadMaxVotar) {
			return true;
		}else {
			return false;
		}
	}
	//Mostrar toda la info
	public String mostrarInfo() {
		String info="La persona "+ nombre +apellido+ 
				" cuyo DNI es " +dni+ " y cuyo sexo es "+ sexo +
				" ,tiene " +CalcularEdad()+" años ya que nació el "+ fnac +
				" y su IMC es de "+Imc;
		return info; 
	}
	
	
	
	
	
	
	
}
