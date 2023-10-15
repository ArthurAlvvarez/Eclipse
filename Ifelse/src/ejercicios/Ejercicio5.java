package ejercicios;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
    System.out.print("Dime un número del 1 al 100: ");
    int numero=sc.nextInt();
    
    if(numero>=1 && numero<=100){
    	System.out.println("Tú número está dentro del rango establecido");
    }
    else  {
    	System.out.println("Tú número no está en el rango establecido");
    }
	}

}
