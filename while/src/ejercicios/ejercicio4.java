package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random()*100+1);
		
		System.out.println("Dime un número entre 1 y 100: ");
		
		int numero = sc.nextInt();
		
		while ( numero != random ){
		
		if(numero > random) {
			
			System.out.println("Baja baja");
		}
		else if(numero < random){
			
			System.out.println("Sube sube");
		}
		
		  numero = sc.nextInt();
		}
		  
		  System.out.println("Bien chaval bien");
	}

}
