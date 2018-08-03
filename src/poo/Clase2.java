package poo;

import paquetePruebas.Clase3;

public class Clase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instancia de clase1
		Clase1 miObjeto = new  Clase1();
		
		// miObjeto.mivar1();  NO PODREMOS ACCEDER EN ESTA VARIABLE, DEBIDO A QUE TIENE EL PRIVATE

		//Instancia de clase3
		Clase3 miObjeto2 = new Clase3();
		System.out.println(miObjeto2.mivar2);
	}

}
