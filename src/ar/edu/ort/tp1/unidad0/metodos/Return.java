package ar.edu.ort.tp1.unidad0.metodos;

public class Return {

	public static void main(String[] args) {
		int resultado;
		resultado = multiplicacion(2,4);
		System.out.println(resultado);
	}
	
	public static int multiplicacion(int i, int j){
		return i*j;
	}
}