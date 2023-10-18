package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	  System.out.println("Dime un número entero positivo: ");
	  
	  int numero = sc.nextInt();
	  int factorial = 0;
	  
	  
	  for(int i = 0; i <= numero; i++){
		  
		  factorial = i* factorial;
		  
		  
		  System.out.println(factorial);
	  }

	}

}
