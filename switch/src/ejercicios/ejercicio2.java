package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		double numero1 = sc.nextDouble();
		
		System.out.println("Dime otro número: ");
		double numero2 = sc.nextDouble();
		
		System.out.println("Dime un operador (+,-,*,/)");
		char operador = sc.next().charAt(0);
		
		double resultado = 0;
		
		switch (operador) {
		
		case '+':
			
			System.out.println(resultado = numero1 + numero2);
		
		break;
		
		case '-':
			
			System.out.println(resultado = numero1 - numero2);
			
			break;
			
		case '*':
			
			System.out.println(resultado = numero1 * numero2);
			
			break;
			
		case '/':
			
			System.out.println(resultado = numero1 / numero2);
			
			break;
			
			default:
				
				System.out.println("Solo pon lo que te pido");
				
		
		
		}

	}

}
