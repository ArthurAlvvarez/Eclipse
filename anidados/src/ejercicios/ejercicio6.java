package ejercicios;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Dime tres números: ");
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		
		if (numero1 < numero2 && numero1 < numero3) {
			System.out.println("Los números están en orden creciente");
		}
		
		else if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("Los números están en orden decreciente");
		}
		
		else {
			System.out.println("Los números no están en un orden específico");
		}
	}

}
