package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu calificación de 0 a 100: ");
		int calificacion= sc.nextInt();
		
		if(calificacion<60){
			System.out.println("Has supendido");
			
		}
		else {
			System.out.println("Has aprobado");
		}
		

	}

}

