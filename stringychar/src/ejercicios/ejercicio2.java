package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime cualquier frase: ");
		String frase = sc.nextLine();
		
	    String frase2 = frase.replace('e', 'x');
	    
	    System.out.println(frase2);

	}

}
