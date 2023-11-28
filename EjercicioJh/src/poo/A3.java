package poo;
/**
 * Mi clase A3 tiene dos variables de tipo int
 */
public class A3 {
		private int numero1;
		private int numero2;
/**
 * Creo la constructura la cual recibe por parametros dos variables de tipo entero 
 * @param numero1
 * @param numero2
 */
		public A3 (int numero1, int numero2) {
			this.numero1 = numero1;
			this.numero2 = numero2;
	}

/**
 * 
 * @param a3
 * @return
 */
		public boolean equals(A3 a3) {
			return(this.numero2 == a3.numero1 &&
					this.numero1 == a3.numero2);
		}
}
