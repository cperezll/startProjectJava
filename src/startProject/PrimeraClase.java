package startProject;
import javax.swing.*;

public class PrimeraClase {

	public static void main(String[] args) {
		
		String clave = "Cristian";
		String pass = "";
		
		while(clave.equals(pass)==false){
			
			pass=JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			
			if (clave.equals(pass)==false){
				System.out.println("Contrase�a incorrecta");
			}
		}
		
		System.out.println("Contrase�a correcta");
	}

}
