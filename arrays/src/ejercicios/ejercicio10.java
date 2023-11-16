package ejercicios;

import java.util.Iterator;

public class ejercicio10 {

	public static void main(String[] args) {
		
		int [][] array = new int [3][3];
		
		array [0][0] = 5;
		array [0][1] = 10;
		array [0][2] = 15;
		
		array [1][0] = 20;
		array [1][1] = 25;
		array [1][2] = 30;
		
		array [2][0] = 35;
		array [2][1] = 40;
		array [2][2] = 45;
		
		System.out.println("Matriz original: ");
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n"+"Promedio de cada fila: ");
		System.out.println("Fila 1: "+(array[0][0] + array [0][1]+ array [0][2]) / 3 );
		System.out.println("Fila 2: "+(array [1][0]+ array [1][1] + array [1][2]) / 3);
		System.out.println("Fila 3: "+(array [2][0]+ array [2][1] + array [2][2]) / 3);
		
		System.out.println("\n"+"Promedio de cada columna: ");
		System.out.println("Columna 1: "+(array[0][0] + array [1][0]+ array [2][0]) / 3);
		System.out.println("Columna 2: "+(array[0][1] + array [1][1]+ array [2][1]) / 3);
		System.out.println("Columna 3: "+(array[0][2] + array [1][2]+ array [2][2]) / 3);
	}

}
