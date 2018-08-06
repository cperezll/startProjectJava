package startProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Uso_HasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String,Float> listaProductos = new HashMap<String,Float>();
		Scanner sc = new Scanner (System.in);
		int opcionElegida = 0;
		float precio;
		String codigo;
		
		while (opcionElegida != 6) {
			System.out.println("Introducir el numero de la opci�n que quieras: ");
			System.out.println("1. - Introducir producto");
			System.out.println("2. - Modificar precio");
			System.out.println("3. - Mostrar todos los productos");
			System.out.println("4. - Eliminar producto");
			System.out.println("5. - Eliminar todos los productos");
			System.out.println("6.- Salir");
			
			//Insertamos la opci�n v�a teclado con Scanner
			opcionElegida = sc.nextInt();
			
			switch (opcionElegida) {
				case 1:
					System.out.println("Introducir el c�digo del producto: ");
					codigo = sc.next();
					System.out.println("Introduce el precio del producto: ");
					precio = sc.nextFloat();
					guardarProducto(codigo,precio,listaProductos);
					break;
					
				case 2:
					System.out.println("Introduce el c�digo de producto que quieres cambiar el precio: ");
					codigo = sc.next();
					modificarPrecio(codigo,listaProductos);
					break;
					
				case 3:
					mostrarProductos(listaProductos);
					break;
					
				case 4:
					System.out.println("Introduce el c�digo de producto que quieres eliminar: ");
					codigo = sc.next();
					eliminarProducto(codigo,listaProductos);
					break;
				
				case 5:
					System.out.println("Eliminar toda la lista de productos de la tienda");
					eliminarTodosLosProductos(listaProductos);
					break;
					
				case 6:
				default:
					System.out.println("Tienes que introducir una opci�n valida");
			}
		}
		
	}
	
	//A�adir nuevos elementos a la lista de los porductos
	public static void guardarProducto(String codigo, Float precio, HashMap<String,Float> listaProductos) {
		if(listaProductos.containsKey(codigo)) {
			System.out.println("No se puede introducir el producto. El c�digo esta repetido.");
		}else {
			System.out.println("El c�digo es valido y no se encuentra en otro producto");
			listaProductos.put(codigo, precio);
		}
	}

	//Modificacion de un porducto a traves de su codigo de producto
	public static void modificarPrecio (String codigo, HashMap<String,Float> listaProductos) {
		Scanner sc = new Scanner(System.in);
		if(listaProductos.containsKey(codigo)) {
			System.out.println("Introduce el precio para el c�digo de producto introducido");
			listaProductos.put(codigo, sc.nextFloat()); //Introducir por teclado el valor del precio, impuesto por el due�o de la tienda
		}else {
			System.out.println("El producto no existe para el c�digo introducido: "+codigo);
		}
	}
	
	//Mostrar los productos disponibles en la tienda
	// Este metodo solo lo obtenemos mediante la clave
	public static void mostrarProductos(HashMap <String, Float> listaProductos) {
		String clave;
		Iterator <String> productos = listaProductos.keySet().iterator();
		System.out.println("Hay los siguientes productos: ");
		System.out.println("==============================");
		System.out.println("C�digo - Precio");
		System.out.println("==============================");
		while(productos.hasNext()) {
			clave = productos.next();
			System.out.println(clave+" - "+listaProductos.get(clave));
		}
		if(!listaProductos.isEmpty()){
			System.out.println("==============================");
		}
	}
	
	//Mostrar los productos disponibles en la tienda
	// Este metodo obtenemos todos los elementos (key & value)
	
	public static void mostrarProductos2(HashMap<String, Float> listaProductos) {
	    Iterator iterador = listaProductos.entrySet().iterator();
	    //Iterator<Map.Entry<String, Float>> iterador = listaProductos.entrySet().iterator();
	    Map.Entry producto;
	    while (iterador.hasNext()) {
	        producto = (Map.Entry) iterador.next();
	        //producto = iterador.next(); Si se usase tambien la otra linea comentada.
	        System.out.println(producto.getKey() + " - " + producto.getValue());
	    } 
	}

	
	
	//Eliminar el producto mediante el codgio determinado
	public static void eliminarProducto(String codigo, HashMap<String, Float> listaProductos) {
		if(listaProductos.containsKey(codigo)) {
			listaProductos.remove(codigo);
		}else {
			System.out.println("El producto que se quiere eliminar no existe con el c�digo introducido: "+ codigo);
		}
	}
	
	//Eliminaci�n de toda la lista de productos
	public static void eliminarTodosLosProductos (HashMap<String, Float> listaProductos) {
		listaProductos.clear();
	}
}
