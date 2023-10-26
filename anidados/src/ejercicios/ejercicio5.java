package ejercicios;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Dime tres números: ");
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("El número más grande es "+ numero1);
		}
		
		else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("El número más grande es "+ numero2);
		}
		
		else {
			System.out.println("El número más grande es "+ numero3);
		}

	}

}
