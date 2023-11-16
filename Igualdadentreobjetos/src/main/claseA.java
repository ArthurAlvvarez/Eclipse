package main;

public class claseA {
	private int x;
	private int y;
	
	public claseA (int x, int y) {
	            this.x = x;
	            this.y = y;
	}
	public boolean equals (claseA a) {
		return (
				this.x == a.x &&
				this.y == a.y
		);
	}
}
