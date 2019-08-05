package ar.edu.ort.tp1.unidad0.objetos;

public class Constructores {

	private int 	numero;
	private String 	texto;
	
	public Constructores() {
		//NUNCA DEJAR UN CONSTRUCTOR VACIO
	}
	
	public Constructores(int numero, String texto) {
		this.numero = numero;
		this.texto = texto;
	}
	
	public Constructores(int numero) {
		this.numero = numero;
	}
	
	public Constructores(String texto) {
		this.texto = texto;
	}
	
	public static void main(String[] args) {
		Constructores ejemplo = new Constructores();
		ejemplo = new Constructores(3, "test");
		ejemplo = new Constructores(3);
		ejemplo = new Constructores("test");
	}
}