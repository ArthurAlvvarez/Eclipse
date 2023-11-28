package ejercicios;
import java.util.Arrays;
public class ejercicio7 {

	public static void main(String[] args) {
		int array[] = {5 , 2 , 7 , 2 , 8 , 5 , 2 , 6 , 7};
		System.out.println("Array con duplicados: \n"+Arrays.toString(array));
		Arrays.sort(array);
		int j = 0;
		int num = array.length;
		
		for (int i = 0; i < num -1; i++) {
			if (array[i] != array[i + 1]) {
				array[j]=array[i];
				j++;
			}
		}
		System.out.println("Array sin duplicados: ");
		for (int i = 0; i < j; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
