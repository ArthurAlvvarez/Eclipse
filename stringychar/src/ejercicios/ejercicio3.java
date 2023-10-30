package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una cadena de texto: ");
		String texto = sc.nextLine();
		
		char vocales = ' ';
		int contador = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			
			vocales = texto.charAt(i);
			
			if (vocales == 'a' || vocales == 'e' || vocales == 'i' || vocales == 'o' || vocales == 'u') {
				
				contador ++;
			}
			
			
		}
		System.out.println(contador);
	}

}
