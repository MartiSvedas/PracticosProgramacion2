package Ejercicio1y2;

import java.util.ArrayList;
 //Ejercicio1//
public class Alarma  {
//	private boolean seRompio;
//	private boolean seAbrio;
//	private boolean seDetectoMov;
	private ArrayList <Sensores> sensores;
	

	public Alarma() {
//		this.seAbrio=false;
//		this.seRompio=false;
//		this.seDetectoMov=false;
		this.sensores= new ArrayList<>();
	}
	
//	public boolean comprobar() {
//		if(this.seAbrio==true || this.seRompio==true ||this.seDetectoMov==true ) {
//				return true;
//						}
//		return false;
//	}
	
	public boolean comprobar(){
		for(int i=0; i<sensores.size();i++) {
			if(sensores.get(i).isActivo()) {
				System.out.println("sonos en " + sensores.get(i).getEspacio());
				return true;
			}
		}return false;
	}
	
	public void hacerSonar() {
		if(this.comprobar()) {
			Timbre.hacerSonar();
		
		}
	}
	
	public ArrayList<Sensores> getSensores() {
		return sensores;
	}
	
	public void addSensor(Sensores s) {
		sensores.add(s);
	}

//	public boolean isSeRompio() {
//		return seRompio;
//	}
//
//	public void setSeRompio(boolean seRompio) {
//		this.seRompio = seRompio;
//	}
//
//	public boolean isSeAbrio() {
//		return seAbrio;
//	}
//
//	public void setSeAbrio(boolean seAbrio) {
//		this.seAbrio = seAbrio;
//	}
//
//	public boolean isSeDetectoMov() {
//		return seDetectoMov;
//	}
//
//	public void setSeDetectoMov(boolean seDetectoMov) {
//		this.seDetectoMov = seDetectoMov;
//	}
	
	
	
	
}
