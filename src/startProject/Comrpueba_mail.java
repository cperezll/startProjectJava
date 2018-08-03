package startProject;

import javax.swing.JOptionPane;

public class Comrpueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//boolean arroba=false;
		int arroba=0;
		
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("Introduce mail");
		

		for (int i=0;i<mail.length();i++){
			if(mail.charAt(i)=='@'){
				arroba++;
			}
			
			if(mail.charAt(i)=='.'){
				punto=true;
			}
		}
		
		if (arroba==1 && punto==true){
			System.out.println("El mail introducido "+ mail +", es correcto. Tiene @ y punto .");
		}else
		{
			System.out.println("El mail "+ mail + " no tiene arroba.");
		}
	}

}
