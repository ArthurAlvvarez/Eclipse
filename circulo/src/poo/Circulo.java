package poo;


/**
 * clase circulo
 */
public class Circulo {

/**
 * creo las variables
 */
	private double area;
	private double perimetro;
	final private double pi = 3.14;
	private double radio;
	
	/**
	 * constructora
	 * @param radio
	 */
	public Circulo (double _radio) {
		
		this.area = 0;
		this.perimetro = 0;
		this.radio = _radio;
	}
	
	/**
	 * metodo que retorna area
	 * @return
	 */
	public double getArea() {
		return this.area;
	}
	
	/**
	 * este metodo retorna perimetro
	 * @return
	 */	
    public double getPerimetro() {
		return this.perimetro;
	}

/**
 * Metodo que retorna el resultado del area
 * @return
 */
    public double getAreaResultado() {
	    return this.area = this.pi * (this.radio * this.radio);
}
    
/**
 * Este metodo retorna el resultado de perimetro
 * @return
 */
    public double getPerimetroResultado() {
	    return this.perimetro = 2 * this.pi * this.radio;
    }
}