package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero = sc.nextInt();
		
		int [] array = {15, 28, 35, 42, 54, 68, 77, 83, 91};
		boolean encontrado = false;
		
		for (int i = 0; i < array.length; i++) {
			
			if (numero == array[i]) {
				System.out.println(numero+" está en la posicion "+(i+1));
				encontrado = true;
			}
			
			/*else if(i < 0) {
				System.out.println("Prueba la próxima vez");
			}*/
		}
		if (!encontrado) {
			System.out.println("Prueba la próxima vez");
		}	
	}

}
