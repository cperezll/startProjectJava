package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj mireloj = new Reloj(3000,false);
		
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null,"Pulsa aceptar para temrinar");
		
		System.exit(0);
	}

}

class Reloj{
	
	private int inervalo;
	private boolean sonido;
	
	public Reloj(int inervalo, boolean sonido){
		
		this.inervalo=inervalo;
		this.sonido=sonido;
		
	}
	
	public void enMarcha(){
		
		ActionListener oyente = new DameLaHora2();
		
		Timer mitemporizador = new Timer(inervalo,oyente);
		
		mitemporizador.start();
	}
	
	//clase interna de damelahora2
	private class DameLaHora2 implements ActionListener{
		public void actionPerformed(ActionEvent event){
			Date ahora = new Date();
			System.out.println("tepongo la hora cada 3 segundos" +ahora);
			
			if(sonido){
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
}