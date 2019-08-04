package ar.edu.ort.tp1.unidad0.condicionales;

public class If {

	public static void main(String[] args) {
		int uno = 1;
		Integer unoMas = new Integer(1);
		Double otroUno = new Double(1);
		
		if(uno==1){
			System.out.println("Son iguales");
		}else{
			System.out.println("Son diferentes");
		}
		
		if(uno==unoMas){
			System.out.println("Son iguales");
		}else{
			System.out.println("Son diferentes");
		}
		
		if(uno==otroUno){
			System.out.println("Son iguales");
		}else{
			System.out.println("Son diferentes");
		}
		
		//Ejemplo de If en una sola línea. ¿Qué pasa si quiero poner un else?
		if(uno == 2)
			System.out.println("Son iguales");
	}
}