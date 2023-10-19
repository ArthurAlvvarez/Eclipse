package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = (int)(Math.random()*100+1);
		
		System.out.println("Dime un número entre 1 y 100: ");
		
		int teclado = sc.nextInt();
		
		while ( teclado!=numero ){
		
		if(teclado > numero) {
			
			System.out.println("Baja baja");
		}
		else if(teclado< numero){
			
			System.out.println("Sube sube");
		}
		
		  teclado = sc.nextInt();
		}
		  
		  System.out.println("Bien chaval bien");
	}

}
