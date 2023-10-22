package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la cantidad de dinero que quieres convertir: ");
		double dinero = sc.nextInt();
		
		System.out.println("Quieres hacer la conversión a Dólares (D) o a Euros (E): ");
		char moneda = sc.next().charAt(0);
		
		double conversion = 0.94;
		
		switch (moneda) {
		
		case 'D':
			
			System.out.println("Tienes " + (conversion * dinero) + "dólares");
			
			break;
			
		case 'E':
			
			System.out.println("Tienes "+ (dinero / conversion) + "euros");
			
			break;
			
			default: 
				
				System.out.println("Error");
		
		}

	}

}
