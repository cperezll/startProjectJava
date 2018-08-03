package poo;
import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Empleado empleado1=new Empleado("cristian perez",18000,2000,4,28); //Instancia
		Empleado empleado2=new Empleado("Juan bautista",100000,2000,4,28); //Instancia
		Empleado empleado3=new Empleado("angel angel",95000,2000,4,28); //Instancia
		Empleado empleado4=new Empleado("Manuel doming",8000,2000,4,28); //Instancia
	
		empleado1.subirSueldo(25);
		empleado2.subirSueldo(10);
		empleado3.subirSueldo(8);
		
		System.out.println("Nombre :"+ empleado1.dameNombre()+ " Sueldo: " +empleado1.dameSueldo()
				+" Fecha de alta: "+empleado1.dameFechaContrato());
		
		System.out.println("Nombre :"+ empleado2.dameNombre()+ " Sueldo: " +empleado2.dameSueldo()
				+" Fecha de alta: "+empleado2.dameFechaContrato());
		
		System.out.println("Nombre :"+ empleado3.dameNombre()+ " Sueldo: " +empleado3.dameSueldo()
				+" Fecha de alta: "+empleado3.dameFechaContrato());
		*/
		
		Jefatura jefeRRHH=new Jefatura("Tito",30000,2000,07,07);
		
		jefeRRHH.darIncentivo(1059);
		
		System.out.println(jefeRRHH.dameSueldo());
		
		Empleado[] misempleados = new  Empleado[6];
		
		misempleados[0] = new Empleado("Ana",18000,2000,07,07);
		misempleados[1] = new Empleado("Cristian",90000,2000,07,07);
		misempleados[2] = new Empleado("Jose",40000,2000,07,07);
		misempleados[3] = new Empleado("Toni",35000,2000,07,07);
		
		//POLIMORFISMO
		misempleados[4]=jefeRRHH; 
		misempleados[5]= new Jefatura("Juan",95000,2000,07,8);
		
		//Refuncidión = casting
		Jefatura jefaFinanzas = (Jefatura) misempleados[5];
		
		//Un empleado no puede ser un jefe con una refundicion. Esto estaria mal
		//Jefatura jefeCompras = (Jefatura) misempleados[1];
		
		jefaFinanzas.darIncentivo(55000);
		
		System.out.println(jefaFinanzas.tomarDecisiones("Dar más días de vacaciones a los empleados."));
		
		misempleados[3].tomarDecisiones("El Juan calma al Cristian");
		
		System.out.println("El jefe X" + jefaFinanzas.dameNombre() + " tiene un bonus de "
				+ ""+ jefaFinanzas.establecerBonus(1500));
		/* UTILIZACION DEL USO DE <<<<INSTANCEOF>>>>
		Empleado directo_comercial= new Jefatura("Albert",2000000,2019,12,14);
		
		Comparable ejemplo=new Empleado("Sandra",14000,1012,11,1);
		
		if(directo_comercial instanceof Empleado){
			System.out.println("Es de tipo Jefatura");
		}
		
		if(ejemplo instanceof Comparable){
			System.out.println("Implementa interface comparable");
		}
		*/
				
		Arrays.sort(misempleados);//nos ordena los objetos de mayor a menor
		
		/*for(int i=0;i<misempleados.length;i++){
			misempleados[i].subirSueldo(5);
		}*/
					
		
		for(Empleado e: misempleados){
			e.subirSueldo(5);
		}
				for(int i=0;i<misempleados.length;i++){
			System.out.println("Nombre: "+misempleados[i].dameNombre()+
					" Sueldo: " +misempleados[i].dameSueldo()
					+ " Fecha de alta: "+ misempleados[i].dameFechaContrato()
					+ "id : " +  misempleados[i].dameId());
		}
	}
}

//Nueva clase dentro de otra clase
class Empleado implements Comparable, Trabajadores{
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente=1;
	
	
	public Empleado(String nom, double sue, int agno, int mes, int dia){

		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		id=idSiguiente;
		idSiguiente++;
	}
	
	//Sobrecarga de constructor
	public Empleado(String nom){
		this(nom,30000,2000,01,01);
	}
	
	
	//CONSTRUCTOR POR DEFECTO
	
	public int dameId(){
		return id;
	}
	
	public String dameNombre(){ //GETTER
		
		return nombre; 
	}
	
	public double dameSueldo(){  //GETTER

		return sueldo;
	}
	
	public Date dameFechaContrato(){ //GETTER
		
		return altaContrato;
	}
	
	public void subirSueldo(double porcentaje){
		
		double aumento = (sueldo*porcentaje)/100;
		
		sueldo+=aumento;
	}
	
	//creamos el metodo del interfice
	
	public int compareTo(Object miObjeto){
		
		Empleado otroEmpleado=(Empleado)miObjeto;//cast de miObjeto - Empleado
		
		if(this.sueldo<otroEmpleado.sueldo){
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo){
			return 1;
		}
		return 0;
	}
	
	public String tomarDecisiones(String decision){
		
		return "Un miembro de la dirección ha tomado la decisión de: " +decision;
	}
	
	//INSTANCIAS en la clase empleado
	public double establecerBonus(double gratificacion){
		
		return Trabajadores.bonusBase+gratificacion;
	}
}

//Clase Jefatura es herencia de Empleado
class Jefatura extends Empleado implements Jefes{

	private  double incentivo;
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia){
		super(nom, sue,agno,mes,dia);	
	}
	
	public void darIncentivo(double incentivo){
		this.incentivo=incentivo;
	}
	
	public double dameSueldo(){
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;			
	}
	
	public double establecerBonus(double gratificacion){
		
		double prima=2000;
		
		return Trabajadores.bonusBase+gratificacion+prima;
	}
	/*Desarrollo del metodo que hemos implmentado, ya que par aimplementaciones 
	tenemos que importar todos su metodos*/
//	public String tomarDecisiones(String decision){
//		
//		return "Un miembro de la dirección ha tomado la decisión de: " +decision;
//	}
	
}

//Clase Director es herencia de Jefatura
/*final :: hace que la ultima clase, osea este, no se extienda hacia abajo mas. Es decir,
no tenga mas herencias
*/
final class Director extends Jefatura {
	
	public Director(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue,agno,mes,dia);
	}
}