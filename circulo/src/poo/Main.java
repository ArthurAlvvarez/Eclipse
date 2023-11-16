package poo;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un radio: ");
		double radio = sc.nextDouble();
		Circulo circulo1 = new Circulo(radio);
		int opcion = 0;
	
	do {
		System.out.println("0 - Salir \n"
				+ "1 - Calcular area \n"
				+ "2 - Calcular perimetro \n");
		System.out.println("Dime una opción: ");
		
		opcion = sc.nextInt();
		
		if (opcion == 1) {
			circulo1.getAreaResultado();
			System.out.println("El area del círculo de radio "+radio+" es "+circulo1.getArea());
			
		}else if (opcion == 2) {
			circulo1.getPerimetroResultado();
			System.out.println("El perímetro del círculo de radio "+radio+" es "+circulo1.getPerimetro());
		}
		
	} while (opcion != 0);
	System.out.println("Adiós!!!!!");

	}

}
