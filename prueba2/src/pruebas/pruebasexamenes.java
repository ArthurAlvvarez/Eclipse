package pruebas;

import java.util.Scanner;

public class pruebasexamenes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la base: ");
		int b = sc.nextInt();
		
		System.out.println("Dime el exponente: ");
		int e = sc.nextInt();
		int multiplicacion = 1;
		
		for (int i = 1; i <= e; i++) {
			multiplicacion *= b;
		}
		System.out.println(b+" elevado a "+e+" es igual a "+multiplicacion);

	}

}
