package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un número: ");
		int numero=sc.nextInt();
		int multiplicacion=0;
		
		for(int i=1;i<=10;i++) {
			
			multiplicacion= i*numero;
			//System.out.println(multiplicacion);
			System.out.println(numero+ " x "+i+"= "+ multiplicacion);
		}
	

	}

}
