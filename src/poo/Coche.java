package poo;


public class Coche {

	private int ruedas; //ENCAPSULADO: únicamente se modifica desde la clase
	private int largo;
	private int ancho;
	private int motor; //centimetros cubicos
	private int peso_plataforma;
	
	private String color;
	private int peso_total;
	private boolean asiento_cuero;
	private boolean climatizador;
	
	//Método constructor. Debé de tener el mismo nombre que la clase principal
	
	public Coche(){
		//Estado inicial del coche
		
		ruedas=4;
		largo=2000;
		ancho=350;
		motor=1600;
		peso_plataforma=500;
		
	}
	
	public String dime_datos_generales(){ //GETTER
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas "
				+ " Mide " + largo/1000 + " metros con ancho de " + ancho + 
				" cm y un peso de plataforma de " +peso_plataforma +" quilos."; 
				
	}
	
	public void establece_color (String color_coche){ //SETTER
		//color = "azul";
		color=color_coche;
		
	}
	
	public String dimeColor(){
		
		return "Dame el color del coche: " + color +".";
	}
	
	public int dimeNumeroRuedas(){
		return ruedas;
	}
	
	public void configura_asientos(String asiento_cuero){ //SETTER 
		
		if(asiento_cuero.equalsIgnoreCase("si")){
			this.asiento_cuero=true;
		}else{
			this.asiento_cuero=false;
		}
	}
	
	public String dime_asientos(){
		
		if (asiento_cuero){
			return "El coche tiene asientos de cuero";
		}else{
			return "El coche tiene asientos de serie";
		}	
	}
	
	public void configura_climatizador (String climatizador){
		
		if (climatizador.equalsIgnoreCase("si")){
			this.climatizador=true;
		}else{
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador(){
		if(climatizador){
			return "El coche incorpora climatizador";
		}else{
			return "El coche lleva aire acondicionado";
		}
	}
	
	public String dime_peso_coche(){ //SETTER + GETTER
		
		int peso_carroceria=500;
		
		peso_total=peso_plataforma + peso_carroceria;
		
		if(asiento_cuero){
			peso_total=peso_total+50;
		}
		if(climatizador){
			peso_total=+20;
		}
		
		return "El peso del coche total es " + peso_total;
	}
	
	public int precio_coche(){ //GETTER 
		
		int precio_final=10000;
		
		if(asiento_cuero==true){
			precio_final+=2000;
		}
		
		if(climatizador==true){
			precio_final+=1500;
		}
		
		return precio_final;
	}
}
