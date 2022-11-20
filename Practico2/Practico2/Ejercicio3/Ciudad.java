package Practico2.Ejercicio3;

public class Ciudad {
	private String nombre;
	private int tamanio;
	private int imp1;
	private int imp2;
	private int imp3;
	private int imp4;
	private int imp5;
	private int gastos;
	private static final double habitantesmin = 100000;//contante
	
	public Ciudad(String nombre,int tamanio, int imp1,int imp2,int imp3,int imp4,int imp5, int gastos) {
		this.nombre=nombre;
		this.tamanio=tamanio;
		this.imp1=imp1;
		this.imp2=imp2;
		this.imp3=imp3;
		this.imp4=imp4;
		this.imp5=imp5;
		this.gastos=gastos;
		
	}
	
	public int getGananciaTotal() {
		int total=0;
		if(this.tamanio>habitantesmin) {
			total+=((this.imp1+this.imp2+this.imp3+this.imp4+this.imp5)*tamanio)-this.gastos;
		}
		return total;
	}
	
	public boolean gastanMas() {
		int total= getGananciaTotal();
		if(total<0) {
			return true;
		}else {
			return false;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamaño(int tamanio) {
		this.tamanio = tamanio;
	}

	public int getImp1() {
		return imp1;
	}

	public void setImp1(int imp1) {
		this.imp1 = imp1;
	}

	public int getImp2() {
		return imp2;
	}

	public void setImp2(int imp2) {
		this.imp2 = imp2;
	}

	public int getImp3() {
		return imp3;
	}

	public void setImp3(int imp3) {
		this.imp3 = imp3;
	}

	public int getImp4() {
		return imp4;
	}

	public void setImp4(int imp4) {
		this.imp4 = imp4;
	}

	public int getImp5() {
		return imp5;
	}

	public void setImp5(int imp5) {
		this.imp5 = imp5;
	}

	public int getGastos() {
		return gastos;
	}

	public void setGastos(int gastos) {
		this.gastos = gastos;
	}
}
