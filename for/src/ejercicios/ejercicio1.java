package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++){
			System.out.println(i);
		}

	}

}
