package ar.edu.ort.tp1.unidad0.arraylist;

public class Persona {

	private String nombre;
	private String apellido;
	private double dni;
	
	Persona(){
		this.nombre 	= "";
		this.apellido 	= "";
		this.dni		= 0;
	}
	
	Persona(String nombre, String apellido, double dni){
		this.nombre 	= nombre;
		this.apellido 	= apellido;
		this.dni		= dni;
	}
	
	Persona(String nombre){
		this.nombre 	= nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public double getDni(){
		return dni;
	}
	
	public void setNombre(String nombre){
		this.nombre 	= nombre;
	}
	
	public void setApellido(String apellido){
		this.apellido 	= apellido;
	}
	
	public void setDni(double dni){
		this.dni 	= dni;
	}
}