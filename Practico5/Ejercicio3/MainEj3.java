package Ejercicio3;

public class MainEj3 {
	
	public static void main (String[]args) {
		Cereal c1=new Cereal("Maiz");
		c1.addminerales("a");
		c1.addminerales("b");
		Cereal c2 = new Cereal ("Granos");
		c2.addminerales("c");
		c2.addminerales("d");
		Cereal c3 = new Pastura("OtroGrano");
		c3.addminerales("e");
		c3.addminerales("f");

		
		Lote l1 = new Lote (60,"LaPastora");
		Lote l2= new Lote(30,"MiRincon");
		Lote l3=new Lote(70,"LugarSoñado");
		Lote l4=new Lote(20,"MiLugar");

		
		l1.addminerales("a");
		l1.addminerales("b");
		l1.addminerales("e");
		l1.addminerales("f");
		
		l1.setCereal(c1);
		
		System.out.println(l1.toString());
		
		l2.addminerales("a");
		l2.addminerales("c");
		
		l2.setCereal(c2);
		
		System.out.println(l2.toString());
		
		l3.addminerales("e");
		l3.addminerales("f");
		
		l3.setCereal(c3);
		
		System.out.println(l3.toString());
		
		l4.addminerales("e");
		l4.addminerales("f");
		
		l4.setCereal(c3);
		
		System.out.println(l4.toString());
		
		
		
		
	}

}
