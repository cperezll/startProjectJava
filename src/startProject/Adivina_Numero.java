package startProject;
import java.util.*;


public class Adivina_Numero {

	public static void main(String[] args) {
		
		int aleatorio = (int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero = 0;
		
		int intentos = 0;
		
		do{
			intentos++;
			System.out.println("Introduce un número,por favor");
			
			numero=entrada.nextInt();
			
			if(aleatorio<numero){
				System.out.println("Mas Alto");
			}else if(aleatorio>numero){
				System.out.println("Mas bajo");
			}
		}while(numero!=aleatorio);
			
		System.out.println("El número introducido es correcto. El número de intentos es "+intentos+" en total");
	}
 }
