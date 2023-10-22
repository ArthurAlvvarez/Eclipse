package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menú de opciones: ");
		
		System.out.println("1.Mostrar información ");
		
		System.out.println("2.Editar perfil ");
		
		System.out.println("3.Salir ");
		
		System.out.println("Elige una opción: ");
		int numero = sc.nextInt();
		
		switch (numero) {
		
		case 1:
			
			System.out.println("Ejercicio 4 de switch");
			
			break;
			
		case 2:
			
			System.out.println("Editando perfil...");
			
			break;
			
		case 3:
			
			System.out.println("Saliendo del programa...");
			
			break;
			
			default:
				
				System.out.println("Esa opción no está disponible");
				
				break;
		}
		
	}

}
