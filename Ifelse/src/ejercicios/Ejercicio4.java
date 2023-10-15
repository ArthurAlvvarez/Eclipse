package ejercicios;

import java.util.Scanner;
import java.util.Calendar;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		System.out.println("¿En qué año naciste?");
		int año= sc.nextInt();
		
		int operacion= cal.get(Calendar.YEAR)-año;
		System.out.println("Tienes "+operacion+" años");

	}

}
