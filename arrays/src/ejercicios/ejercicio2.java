package ejercicios;

import java.util.Iterator;

public class ejercicio2 {

	public static void main(String[] args) {
	
		int[] array = {1,2,3,4,5,6};
		
		for(int i = 0; i < array.length; i++) {
			
			if (array[i] % 2 == 0) {
				
				System.out.println("El índice "+i+" es par");
			}
			
			else {
				System.out.println("El índice "+i+" es impar");
			}
			
		}
	}

}
