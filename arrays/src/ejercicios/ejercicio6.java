package ejercicios;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = {2,3,5,8,9};
		System.out.println("Dime que posición quieres modificar: ");
		int num = sc.nextInt();
		System.out.println("Que número quieres introducir: ");
		int num2 = sc.nextInt();
		
		for (int i = array.length; i > num; i++) {
			array[num] = num2;
		}
		System.out.println(Arrays.toString(array));
	}

}
