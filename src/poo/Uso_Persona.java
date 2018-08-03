package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona [] lasPersonas = new Persona[2];
	
		lasPersonas[0] = new Empleado2("Cristian",50000,12,05,21);
		lasPersonas[1] = new Alumno("Cristian","Telecos");
	
		//for del tipo each.
		for(Persona p: lasPersonas){
			System.out.println(p.dameNombre() +", "+ p.dameDescripcion());
		}
	}
}

abstract class Persona{
	
	protected String nombre;
	
	//Constructor pasamos un parametro. Este es nombre=nom
	public Persona(String nom){
		nombre=nom;
	}

	//GETERS's
	public String dameNombre(){
		return nombre;
	}
	
	public abstract String dameDescripcion();
}

class Empleado2 extends Persona{
	
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente=1;
	
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia){
		
		super(nom);
		
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		id=idSiguiente;
		idSiguiente++;
	}
	
	//CONSTRUCTOR POR DEFECTO
	
	public int dameId(){
		return id;
	}
	

	public double dameSueldo(){  //GETTER

		return sueldo;
	}
	
	public Date dameFechaContrato(){ //GETTER
		
		return altaContrato;
	}
	
	//Abstracta->redefinimios la clase que se ha llamado este constructor
	//se llamara en la clase abstracta de persona
	public String dameDescripcion(){

		return "Este empleado tiene un Id= "+id+ ", Con un sueldo de " +sueldo;
	}
	
	public void subirSueldo(double porcentaje){
		
		double aumento = (sueldo*porcentaje)/100;
		
		sueldo+=aumento;
	}
}

class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nom, String carr){
		
		super(nom);	
		carrera=carr;
	}
	
	//Sobreescribimos el metodo dame descripcion
	public String dameDescripcion(){
		
		return "Este alumno " +nombre+ ", esta estudiando la carrera de " +carrera;
	}
}