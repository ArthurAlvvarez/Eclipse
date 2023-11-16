package ejercicios;

import java.util.Iterator;

public class ejercicio8 {

	public static void main(String[] args) {
		 
		int [][] array1 = new int [3][3];
		int [][] array2 = new int [3][3];
		array1 [0][0] = 1;
		array1 [0][1] = 2;
		array1 [0][2] = 3;
		
		array1 [1][0] = 4;
		array1 [1][1] = 5;
		array1 [1][2] = 6;
		
		array1 [2][0] = 7;
		array1 [2][1] = 8;
		array1 [2][2] = 9;
		
		array2 [0][0] = 9;
		array2 [0][1] = 8;
		array2 [0][2] = 7;
		
		array2 [1][0] = 6;
		array2 [1][1] = 5;
		array2 [1][2] = 4;
		
		array2 [2][0] = 3;
		array2 [2][1] = 2;
		array2 [2][2] = 1;
		
		System.out.println("Matriz 1:");
		
		for (int i = 0; i < array1.length; i++) {
			
		for (int j = 0; j < array1.length; j++) {
			
			System.out.print(array1[i][j]+" ");
		}
		System.out.println();
		
		}
		System.out.println("\n"+"Matriz 2:");
		
		for (int i = 0; i < array2.length; i++) {
			
			for (int j = 0; j < array2.length; j++) {
				
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
			
			}
		System.out.println("\n"+"Matriz resultante:");

		for(int i = 0; i < array1.length; i++) {
			
			for (int j = 0; j < array2.length; j++) {
				
				System.out.print(array1[i][j]+array2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
