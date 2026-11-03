package excepciones;
import java.util.*;
public class tryfinally {

	public static void main(String[] args) {
		Scanner input = null;
		try {
		input = new Scanner(System.in);
		System.out.println("Introduce un nombre: ");
		String nombre = input.nextLine();
		System.out.println("Hola: "+nombre);
		
		}catch (Exception a) {
			System.out.println("Error al leer del teclado");
		}finally {
			System.out.println("siempre se ejecuta");
			if (input != null) {
				input.close();
				System.out.println("Scanner cerrado");
				
			}
		}
	}

}
