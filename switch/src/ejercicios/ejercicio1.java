package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número del 1 al 7: ");
		
		int numero = sc.nextInt();
		
		switch (numero) {
		
		case 1: 
			
			System.out.println("Es Lunes");
			
			break;
			
		case 2:
			
			System.out.println("Es Martes");
			
			break;
			
		case 3: 
			
			System.out.println("Es Miércoles");
			
			break;
			
		case 4:
			
			System.out.println("Es Jueves");
			
			break;
			
		case 5:
			
			System.out.println("Es Viernes");
			
			break;
		
		case 6: 
			
			System.out.println("Es Sábado");
			
			break;
			
		case 7:
			
			System.out.println("Es Domingo");
			
			break;
			
		default: 
			
			System.out.println("El número introducido está fuera del rango");
			
			break;	
		}

	}

}
