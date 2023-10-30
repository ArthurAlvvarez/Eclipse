package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa una palabra: ");
		String palabra = sc.nextLine();
		
		char letra = ' ';
		String reves = "";
		
		for (int i = palabra.length()-1; i >= 0; i--) {
			
			letra = palabra.charAt(i);
			reves += letra;
		}
		System.out.println(reves);
	}

}
