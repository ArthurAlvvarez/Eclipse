package ejercicios;

import java.util.Scanner;

public class ejercico4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Dime cuanto mide cada lado de tú triángulo: ");
		int lado1 = sc.nextInt();
		int lado2 = sc.nextInt();
		int lado3 = sc.nextInt();
		
		if (lado1 == lado2 && lado1 == lado3) {
			
			System.out.println("Tú triángulo es equilátero");
		}
		
		else if(lado1 != lado2 && lado1 != lado3) {
			
			System.out.println("Tú triángulo es escaleno");
		}
		else {
			System.out.println("Tú triángulo es isósceles");
		}
		

	}

}
