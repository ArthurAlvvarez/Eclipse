package poo;
/**
 * Creo en mi clase A1 3 variables, num de tipo int, obj1 es un objeto de tipo A2 
 * y obj2 es un objeto de tipo A3
 */
public class A1 {
	private int num;
	private A2 obj1;
	private A3 obj2;

/**
 * Creo la constructora a la que le paso por parámetros un tipo entero, un objeto de tipo A2
 * y un objeto de tipo A3
 * @param num
 * @param obj1
 * @param obj2
 */
	public A1(int num, A2 obj1, A3 obj2){
		this.num = num;
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
/**
 * 
 * @param a1
 * @return
 */
	public boolean equals(A1 a1) {
		return(this.num == a1.num &&
			   this.obj1.equals(a1.obj1)&&
			   this.obj2.equals(a1.obj2));
	}
}
