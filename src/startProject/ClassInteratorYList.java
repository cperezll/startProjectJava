package startProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassInteratorYList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EjemploLista 
				List<String> ejemploLista = new ArrayList<String>();
				
				ejemploLista.add("Cristian");
				ejemploLista.add("Daniel");
				ejemploLista.add("Esteban");
				ejemploLista.add("Juani");
				ejemploLista.add("Ruth");

				System.out.println(ejemploLista);
				System.out.println(ejemploLista.size());
				System.out.println(ejemploLista.get(2));
				
				ejemploLista.remove(2);
				
				System.out.println(ejemploLista.get(2));
				System.out.println(ejemploLista);
				System.out.println(ejemploLista.isEmpty());
				
				Iterator<String> i = ejemploLista.iterator();
				while(i.hasNext()) {
					System.out.println(i.next());
				}
				
				ejemploLista.set(1,"Dani");//Modificaci�n del nombre Daniel por Dani en la segunda posici�n
				System.out.println("El nombre de Daniel se cambi� por Dani: " + ejemploLista.contains("Dani")); //La lista ahora contiene Dani
				
				//A�adir solo los elementos que queremos ver nosotros entre los nombres
				
				
				System.out.println("La lista actual solo incluye a dos miembros familiares" + ejemploLista.subList(1, 3));
				
				ejemploLista.clear(); //Eliminamos todos los elementos de la lista de manera r�pida
				
				System.out.println(ejemploLista.isEmpty());

				if(ejemploLista.size()==0)
					System.out.println("Lista vacia, con " + ejemploLista.size() +" cero elementos.");
					
	}

}
