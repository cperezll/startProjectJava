

package startProject;
import javax.swing.*;

public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String genero="";
		
		do{
			genero=JOptionPane.showInputDialog("Introduce tu g�nero (H/M)");
		
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
		
		int pesoIdeal=0;
		
		if(genero.equalsIgnoreCase("H")){
			
			pesoIdeal=altura-110;
		
		}
		else if(genero.equalsIgnoreCase("M")){
			
			pesoIdeal=altura-120;
		}
	
		System.out.print("Tu peso ideal es" + pesoIdeal + "Kg");
	
	}
}
