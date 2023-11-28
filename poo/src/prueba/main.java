package prueba;


public class main {

	public static void main(String[] args) {

		Persona persona1 = new Persona();
		persona1.dni_edad_telefono(50564648, 22, 625897456);
		System.out.println(persona1.getEdad()+ " " + persona1.getDni()+ " " +persona1.getTelefono());
	}

	

}

