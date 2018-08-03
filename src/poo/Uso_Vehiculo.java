package poo;

import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {

//		//instanciar una clase, ejemplar de clase 
//		Coche Opel=new Coche();
//		
//		
//		//System.out.println("Este coche tiene "+ Opel.ruedas);
//		
//		System.out.println(Opel.dimeNumeroRuedas());
//		
//		
//		Opel.establece_color(JOptionPane.showInputDialog("Introduce un color."));
//		
//		System.out.println(Opel.dime_datos_generales());
//		
//		System.out.println(Opel.dimeColor());
//
//		Opel.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
//		
//		System.out.println(Opel.dime_asientos());
//		
//		Opel.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatización?"));
//		
//		System.out.println(Opel.dime_climatizador());
//		
//		System.out.println(Opel.dime_peso_coche());
//		
//		System.out.println("El precio final del coche es:" + Opel.precio_coche());
		
		Coche miCoche1 = new Coche();
		
		miCoche1.establece_color("Azul");
		
		Furgoneta miFurgoneta1 = new Furgoneta(7,580);
		
		miFurgoneta1.establece_color("Rojo");
		miFurgoneta1.configura_asientos("si");
		miFurgoneta1.configura_climatizador("si");
		
		System.out.println(miCoche1.dime_datos_generales()+"\n"+ miCoche1.dimeColor());
		
		System.out.println(miFurgoneta1.dime_datos_generales() + miFurgoneta1.dimeDatosFurgoneta());
		
	}
}
