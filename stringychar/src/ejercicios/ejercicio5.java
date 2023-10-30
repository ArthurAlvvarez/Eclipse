package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta una palabra o una frase: ");
		String texto = sc.nextLine();
		
		String texto2 = texto.toLowerCase();
		char letras = ' ';
		String texto3 = "";
	
		for (int i = texto2.length()-1; i >= 0 ; i--) {
			
			letras = texto2.charAt(i);
			texto3 += letras;
						
			}
		
		if (texto2.equals(texto3)== true) {
			System.out.println("Es palíndromo");
			
			
		}
		
		else {
			System.out.println("No es palíndromo");
		}
	}

}
