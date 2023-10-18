package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		
		int numero = sc.nextInt();
		int i = 1;
		
		while(i <= numero) {
			
			System.out.println(i);
			
			i++;
				
		}
		

	}

}
