package ar.edu.ort.tp1.unidad0.arraylist;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Juan", "Perez", 1234));
		personas.add(new Persona("Carla", "Perez", 3434343));
		
	    ArrayList<String> autos 	= new ArrayList<String>();
	    autos.add("Volvo");
	    autos.add(0, "Honda");//¿Qué pasa si pongo la posicion 2?
	    autos.add("Ford");
	    autos.add("Mazda");
	    System.out.println(autos);
	    
	    String honda = autos.get(0);
	    
	    System.out.println(honda);
	    
	    System.out.println("Tamaño: " + autos.size());
	    autos.remove(0);
	    
	    System.out.println(autos);
	    
	    System.out.println("Recorrer el ArrayList usando un for:");
	    for (int i=0; i<personas.size();i++){
	    	System.out.println(personas.get(i).getNombre() + " " + personas.get(i).getApellido());
	    }
	    
	    System.out.println("Recorrer el ArrayList usando un foreach:");
	    for (Persona p : personas){
	    	System.out.println(p.getNombre() + " " + p.getApellido());
	    }
	    
	 // Búsqueda de la persona por nro de documento.
	 // Creamos una variable auxiliar donde dejaremos el elemento buscado, si lo encontramos.
	 Persona personaBuscada = null;
	 int indice = 0;
	 // Buscamos mientras no hayamos llegado al final de la estructura y no hayamos encontrado el
	 // elemento que estamos buscando.
	 while (indice < personas.size() && personaBuscada == null) {
	 	if (personas.get(indice).getDni() == 1234) {
	 		// si la encontramos, la asignamos al auxiliar
	 		personaBuscada = personas.get(indice);
	 	} else {
	 		// incrementamos el índice para pasar al siguiente elemento
	 		indice++;
	 	}
	 }
	 System.out.println("La persona buscada es: " + personaBuscada.getNombre() + " " + personaBuscada.getApellido());
	    
	} 
}