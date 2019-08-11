package ar.edu.ort.tp1.unidad0.arraylist;

import java.util.ArrayList;

public class EliminarNumeros {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(7);
		numeros.add(9);
		numeros.add(17);
		numeros.add(22);
		
		// Eliminando todos los números pares de la colección.
		int indice = 0;
		// buscamos mientras no hayamos llegado al final
		// de la estructura.
		while (indice < numeros.size()) {
			if (numeros.get(indice) % 2 == 0) {
				// si es par lo quitamos
				numeros.remove(indice);
			} else {
				// incrementamos el índice para
				// pasar al siguiente elemento
				indice++;
			}
		}
		
		System.out.println(numeros);
	}
}