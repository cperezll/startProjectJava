package poo;

public class Clase1 {
	
	private int mivar=5; //encapsulo mi variable unicamente para esta classse.
	protected int mivar2=7;
	
	
	//no tenemos constructor por defecto, por lo tanto no tendra valores la variable.
	String miMetodo(){
		return "El valor de mivar2 es: " +mivar2;
	}

}
