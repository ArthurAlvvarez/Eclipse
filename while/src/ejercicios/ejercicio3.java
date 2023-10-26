package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		
		int numero = sc.nextInt();
		
		int contador = 0;
		
		while(numero > 0) {
			
			numero = numero/10;
			
		contador++;	
		
		}
		System.out.println("Tu numero tiene "+contador+" cifra(s).");
	}

}
