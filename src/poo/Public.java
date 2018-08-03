package poo;

public class Public {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1 = new Empleados("Cristian");
		Empleados trabajador2 = new Empleados("Juan");
		Empleados trabajador3 = new Empleados("Juan2");
		Empleados trabajador4 = new Empleados("Juan3");
		
		trabajador2.cambiarSeccion("RRHH");
		trabajador4.cambiarSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos()+ "\n" + trabajador2.devuelveDatos()+ "\n" + trabajador3.devuelveDatos()+ "\n" + trabajador4.devuelveDatos()+ "\n");
		
		System.out.println(Empleados.damaIdSiguiente());
	}
}


class Empleados{
			
	private final String nombre;
	private String seccion;	
	private int id;
	private static int idSiguiente=1;
	
	//Constructor estado inicial
	public Empleados(String nom){
		
		nombre=nom;
		seccion="Adminsitracion";
		id=idSiguiente;
		idSiguiente++;
				
	}
	//COSNTRUCCION DE LOS METODOS GETTER Y SETTER
	
	public void cambiarSeccion(String seccion){ //setter
		this.seccion=seccion;		
	}

	public String devuelveDatos(){
		
		return "El nombre es: " +nombre + " y la seccion es: "+seccion +" y el id es "+id+" ."; 
	}
	
	public static String damaIdSiguiente(){
		
		return "El idSiguientes es: " +idSiguiente;
	}
	
	
}