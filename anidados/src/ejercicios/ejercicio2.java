package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero = sc.nextInt();
		
		for(int i = 1;i <= numero; i++) {
			
		for(int j = 1;j <= i; j++ ) {
			
			System.out.print(j);
		}
		    System.out.println();
		
		}

	}

}
