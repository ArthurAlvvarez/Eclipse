package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingresa una cadena de texto: ");
		
		String texto = sc.nextLine();
		char letra = ' ';
		int contador = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			
			 letra = texto.charAt(i);
			 
			 if (letra == 'a' || letra == 'A') {
				
			contador++;
			}
			 
			}
			
		System.out.println(contador);

	}

}
