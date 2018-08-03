package poo;

public class Furgoneta extends Coche{

	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_carga){
		
		super();//llama al constructor de la clase padre
		
		this.plazas_extra=plazas_extra;
		this.capacidad_carga=capacidad_carga;
	}
	
	public String dimeDatosFurgoneta(){
		return "La capazidad de carga es : " + capacidad_carga
				+ " Y el número de plazas es: " + plazas_extra;
	}
}
