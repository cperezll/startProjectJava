package startProject;
//import javax.swing.JOptionPane;
import java.util.*; //clase scaner

////////////////////////////////////////////////////////////////////////////
//ESTA CLASE ESTA REFERENCIADA A LA UTILIZACION DE LOS ENUMERADOS
//////////////////////////////////////////////////////////////////////////

public class Uso_Tallas {

	//API de java 	
	enum Talla{
		
		MINI("S"),MEDIANO("M"),GRANDE("G"),MUYGRANDE("XL");
		
		private String abreviatura;
	
		//SETTER+ConstructorDefecto
		private Talla(String abreviatura){			
			this.abreviatura=abreviatura;
		}
	
	//GETTER
		public String dameAvrebiatura(){
			return abreviatura;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				/*Talla s=Talla.MINI;
				Talla m=Talla.MEDIANO;
				Talla l=Talla.GRANDE;
				Talla xl=Talla.MUY_GRANDE;*/
				
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
				
				String entrada_datos=entrada.next().toUpperCase(); // pasa a mayusculas lo introducido en pantalla
				
				Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
				
				System.out.println("Talla= " + la_talla);
				
				System.out.println("Abreviatura = " + la_talla.dameAvrebiatura());
	}
}