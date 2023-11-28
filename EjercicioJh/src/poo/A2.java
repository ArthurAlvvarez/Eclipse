package poo;
/**
 * En mi clase A2 creo dos variables, michar que es de tipo char y un objeto de tipo A3
 */
public class A2 {
	private char michar;
	private A3 a;
	
/**
 * Creo la constructora la cual le paso por párametros michar de tipo char 
 * y un objeto a de tipo A3
 * @param michar
 * @param a
 */
	public A2(char michar, A3 a) {
		this.michar = michar;
		this.a = a;
	}
	
/**
 * 
 * @param a2
 * @return
 */
	public boolean equals (A2 a2) {
		return(this.michar == a2.michar &&
			   this.a.equals(a2.a));
	}
}
