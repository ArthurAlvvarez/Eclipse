package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Matriz original: ");
		int [][] array = {{1 , 2 , 3} , {4 , 5 , 6} , {7 , 8 , 9}};
		boolean valida;
		int suma = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			valida = false;
			while (!valida) {
				System.out.println("Dime que posición (fila y columna) quieres sumar: ");
				int fila = sc.nextInt();
				int columna = sc.nextInt();
			
				if (fila >= 0 && fila <= array.length && columna >= 0 && columna <= array[0].length) {
				System.out.println("Posición correcta");
				suma += array[fila][columna];
				valida = true;
			}
				else {
					System.out.println("Posición fuera de los límites de la matriz. No se suma");
				}
			}
		}
		System.out.println("La suma de las posiciones es : "+ suma);
	}
}
