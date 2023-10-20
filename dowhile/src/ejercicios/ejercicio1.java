package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un  número: ");
		
		int numero= sc.nextInt();
		int   i = 0;
		
		do {
			System.out.println(numero+ " x "+i+" = "+i*numero);
			
			i++;
			
		}while(i <= 10);
		
		
	}

}
