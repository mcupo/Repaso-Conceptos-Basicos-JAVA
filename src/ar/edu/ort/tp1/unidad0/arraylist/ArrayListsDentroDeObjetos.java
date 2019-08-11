package ar.edu.ort.tp1.unidad0.arraylist;

import java.util.ArrayList;

public class ArrayListsDentroDeObjetos {
	private ArrayList<Persona> personas = null;
	
	public ArrayListsDentroDeObjetos() {
		this.personas = new ArrayList<Persona>();
	}
	
	public void agregarSocio(Persona persona) {
		personas.add(persona);
	}
	
	public void agregarSocio(String nombre) {
		personas.add(new Persona(nombre));
	}
	
	public static void main(String[] args) {
		
	}
}