package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		
		int numero = sc.nextInt();
		
		for(int i = numero; i >= 1 ; i--){
			
			System.out.println(i);
		}

	}

}
