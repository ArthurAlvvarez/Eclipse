package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa una palabra: ");
		String palabra = sc.nextLine();
		
		palabra = palabra.replace(" ", "").toLowerCase();
		String reves = "";
		
		for (int i = palabra.length()-1; i >= 0; i--) {
			
			reves += palabra.charAt(i);
		}
		System.out.println(reves);
	}

}
