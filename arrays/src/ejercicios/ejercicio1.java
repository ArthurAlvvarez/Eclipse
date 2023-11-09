package ejercicios;

public class ejercicio1 {

	public static void main(String[] args) {
		
		int array[] = {2,3,5,8,9,4,7,6,0};
		
		int resultado = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			resultado += array[i];
			
		}
		
		System.out.println(resultado);

	}

}
