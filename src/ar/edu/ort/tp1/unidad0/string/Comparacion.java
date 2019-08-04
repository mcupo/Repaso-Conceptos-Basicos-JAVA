package ar.edu.ort.tp1.unidad0.string;

public class Comparacion {

	public static void main(String[] args) {
		//La JVM va a almacenar todos los Strings constantes con el mismo nombre en una sola referencia de memoria
		String juan = "Juan";
		String otroJuan = "Juan";
		String pedro = new String ("Pedro");
		String otroPedro = new String ("Pedro");
				
		if(juan == otroJuan){
			System.out.println("Son iguales");
		}
		else{
			System.out.println("Son diferentes");
		}
		
		if(pedro == otroPedro){
			System.out.println("Son iguales");
		}
		else{
			System.out.println("Son diferentes");
		}
		
		if(pedro.equals(otroPedro)){
			System.out.println("Son iguales");
		}
		else{
			System.out.println("Son diferentes");
		}
	}
}