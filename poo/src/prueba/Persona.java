package prueba;

/**
 * clase Persona
 */
public class Persona {
	private String nombre;
	private String apellido;
	private int DNI;
	private int telefono;
	private int edad;

	public void nombre_apellidos  (String _nombre, String _apellido) {
		this.nombre = _nombre;
		this.apellido = _apellido;
	}

	public void dni_edad_telefono (int _DNI, int _edad, int _telefono) {

		this.DNI = _DNI;

		this.edad = _edad;

		this.telefono = _telefono;

		

	}

	public String getNombre() {

		return this.nombre;

	}

	public String getApellido() {

		return this.apellido;

	}

	

	public int getEdad() {

		return this.edad;

	}
	
	public int getDni() {
		
		return this.DNI;
	}
	
public int getTelefono() {
		
		return this.telefono;
	}

		

	

	

}