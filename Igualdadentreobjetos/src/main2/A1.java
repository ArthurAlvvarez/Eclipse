package main2;

public class A1 {
	private int x;
	private B b;
	
	public A1 (int x, B b) {
		this.x = x;
		this.b = b;
}
	public boolean equals (A1 a) {
		return (
				this.x == a.x &&
				this.b.equals(a.b)
				);
	}
	public A1 clone () {
		return new A1(
				this.x,
				this.b.clone()
				);
	}
}