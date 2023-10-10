package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Dime un número:");
	int num=sc.nextInt();
	
	int ecuacion= num%2;
	
	
	if (ecuacion==0) {
		System.out.println("Tú número es par");
	}
	else {
		System.out.println("Tú número es impar");
	}

}

}
