package poo;

//LAS INTERFACES TIENEN METODOS QUE NO SE DESARROLLAN SOLO SE DEFINEN
public interface Trabajadores {

	public abstract double establecerBonus(double gratificacion);
	//no se suelen poner el public ni el abstract, porque ya los lleva por defecto
	
	public static final double bonusBase=1500; //nombre cnt en cursiva, porque es una variable estatica
	// public statis final, si no lo ponemos no pasa nada
}
  