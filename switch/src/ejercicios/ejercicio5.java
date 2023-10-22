package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una calificacion entre 1 y 5: ");
		int numero = sc.nextInt();
		
		switch(numero) {
		
		case 1:
			
			System.out.println("Supendido");
			
			break;
			
		case 2:
			
			System.out.println("Casi");
			
			break;
			
		case 3:
				
	        System.out.println("Aprobado");
	
	        break;
	        
		case 4:
	
	        System.out.println("Notable");
	
	        break;
	
        case 5:
	
	        System.out.println("Sobresaliente");
	
	        break;
	
        default:
	
	        System.out.println("Seguro que has supendido...");
	
	        break;
		}

	}

}
