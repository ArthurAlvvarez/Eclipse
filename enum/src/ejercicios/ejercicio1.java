package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	public enum DiaSemana {
		LUNES , MARTES , MIERCOLES , JUEVES , VIERNES , SABADO , DOMINGO
		}

	public static void main ( String [] args ) {
		Scanner scanner = new Scanner ( System . in ) ;
		System . out . print (" Ingrese un numero (1 para Lunes , 2 para Martes , etc .): ") ;
		int numero = scanner . nextInt () ;
		
		if ( numero >= 1 && numero <= DiaSemana . values () . length ) {
		DiaSemana dia = DiaSemana . values () [ numero - 1];
		System . out . println ("El dia seleccionado es: " + dia ) ;
		} else {
		System . out . println (" Numero de dia no valido .") ;
		}
	}
}
