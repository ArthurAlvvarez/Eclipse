package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		
		int numero = sc.nextInt();
		
		int i = 1;
		
		int suma = 0;
		
		do {
			
			if(i % 2 == 0){
				
				suma = i + suma;
				 
				
				
			}
			
			i++;
			
		}while(i <= numero);
		
		System.out.println(suma);

	}

}
