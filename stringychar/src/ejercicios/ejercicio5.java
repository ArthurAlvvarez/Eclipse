package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta una palabra o una frase: ");
		String texto = sc.nextLine();
		
		texto = texto.toLowerCase();
		String letras = "";
	
		for (int i = texto.length()-1; i >= 0 ; i--) {
			
			letras += texto.charAt(i);
			//texto3 += letras;
						
			}
		
		if (texto.equals(letras)== true) {
			System.out.println("Es palíndromo");
			
			
		}
		
		else {
			System.out.println("No es palíndromo");
		}
	}

}
