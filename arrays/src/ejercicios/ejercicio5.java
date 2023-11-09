package ejercicios;

public class ejercicio5 {

	public static void main(String[] args) {
		
		int array[] = {2,3,5,8,9,4,7,6,0};
		
		for (int i = 0; i < array.length; i++) {
			array[i]= array[3+1];
			
			System.out.println(array[i]);
		}

	}

}
