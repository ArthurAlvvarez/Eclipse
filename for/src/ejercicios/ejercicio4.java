package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	  System.out.println("Dime un número entero positivo: ");
	  
	  int numero = sc.nextInt();
	  int factorial = 1;
	  
	  
	  for(int i = numero; i > 0; i--){
		  
		  factorial = i* factorial;
		  
		  //System.out.println(factorial);
		  
	  }
	  System.out.println("El factorial de "+ numero + " es "+ factorial);
	}

}
