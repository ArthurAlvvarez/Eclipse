package ejercicios;

public class ejercicio4 {
	public enum ColorArcoiris {
		ROJO , NARANJA , AMARILLO , VERDE , AZUL , INDIGO , VIOLETA
		}
		
		public static void main ( String [] args ) {
		System . out . println (" Colores del arcoiris :") ;
		
		for ( ColorArcoiris color : ColorArcoiris . values () ) {
		System . out . println ( color ) ;
		}
		}
}
