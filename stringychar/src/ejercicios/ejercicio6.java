package ejercicios;

import java.util.Scanner;

import javax.management.Query;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa una cadena de texto: ");
		String texto = sc.nextLine();
		
		System.out.println("¿Qué carácter quieres cambiar?: ");
		char caracter = sc.next().charAt(0);
		
		System.out.println("¿Por cual quieres cambiarla?: ");
		char caracter2 = sc.next().charAt(0);
		
		String texto2 = texto.replace(caracter, caracter2);
		
		System.out.println(texto2);

	}

}
