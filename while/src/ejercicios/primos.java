package ejercicios;

/**
 * Esta es la clase para recorrer todos los primos
 */
public class primos {
/**
 * Metodo main
 * @param args
 */
	public static void main(String[] args) {
		
		/**
		 * declaro el tipo de variable y su valor 
		 */
		int i = 2;
		int contenedor = 0;
		/**
		 * declaro la condicion while y le digo que mientras que i sea menor que 10000 que me imprima todos los resultados
		 */
		while (i < 10000) {
		
			
			
			if ( (i % 2 == 0) && (i % 3 == 0) ) {
				
			
				i++;
				
				
			}
			System.out.println(i);
			
			
		}
		

	}

}
