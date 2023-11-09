package ejercicios;

public class ejercicio3 {

	public static void main(String[] args) {
	
		
		int multiplicacion = 0;
		
		for(int b = 1; b <= 10; b++) {
			
			System.out.print("  | " + b + " | ");
		}
		
		System.out.println("");
		
		for(int c = 1; c <= 10; c++) {
			
			System.out.print("--------");
			
		}
		
		System.out.println();
		
		for(int i= 1 ;i <= 10;i++) {
			
		System.out.print(i+"    ");	
		
			
		for(int j = 1; j<= 10; j++) {
			
			multiplicacion= i* j;
			System.out.print("|"+multiplicacion+"|    ");
		}
		
		System.out.println("\n");
		
		}
	}

}
