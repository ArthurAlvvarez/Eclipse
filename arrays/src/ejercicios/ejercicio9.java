package ejercicios;

public class ejercicio9 {

	public static void main(String[] args) {
		
		int [][] array1 = new int [3][3];
		
		array1 [0][0] = 1;
		array1 [0][1] = 2;
		array1 [0][2] = 3;
		
		array1 [1][0] = 4;
		array1 [1][1] = 5;
		array1 [1][2] = 6;
		
		array1 [2][0] = 7;
		array1 [2][1] = 8;
		array1 [2][2] = 9;
		
        System.out.println("Matriz original:");
		
		for (int i = 0; i < array1.length; i++) {
			
		for (int j = 0; j < array1.length; j++) {
			
			System.out.print(array1[i][j]+" ");
		}
		System.out.println();
		
		}
		System.out.println("\n"+"Matriz traspuesta: ");
		for (int i = 0; i < array1.length; i++) {
			
			for (int j = 0; j < array1.length; j++) {
				
				System.out.print(array1[j][i]+" ");
			}
			System.out.println();
		}
		

	}

}
