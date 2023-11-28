package main2;

public class B {
	private int z;
	
	public B (int z) {
		this.z = z;
	}
	public boolean equals (B b) {
		return (
		this.z == b.z
		);
	}
	public B clone () {
		return new B(this.z);
		}
}
