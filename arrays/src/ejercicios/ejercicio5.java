package ejercicios;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = {2,3,5,8,9};
		System.out.println("Dime que posición quieres eliminar del 0 al 4 \n"+Arrays.toString(array));
		int num = sc.nextInt();
		
		for (int i = num; i < array.length -1; i++) {
			array[i] = array[i + 1];
		}
		System.out.println(Arrays.toString(array));
	}

}
