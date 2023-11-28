package poo;


public class Main {

	public static void main(String[] args) {
		
		
		A3 persona3 = new A3(0, 0);
		A2 persona2 = new A2('a', persona3);
		A1 persona1 = new A1(0, persona2, persona3);
		
		System.out.println(persona3.equals(persona3));
		System.out.println(persona2.equals(persona2));
		System.out.println(persona1.equals(persona1));

	}

}
