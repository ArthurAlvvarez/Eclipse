package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int numero = scanner.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			
			for(int j = 1;j <= i; j++) {
				
				
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
