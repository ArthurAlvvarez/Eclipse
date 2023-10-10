package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Dime un número positivo, negativo o 0");
	int num=sc.nextInt();
	
	if(num==0){
		System.out.println("Es 0 tu número");
		
	}
	else if(num<=0 ) {
		System.out.println("Tú número es negativo");
	}
	else {
		System.out.println("Tu número es positivo");
	}
			

}

}