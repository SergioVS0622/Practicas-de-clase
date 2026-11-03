package tareaahorcado;
import java.util.Scanner;
public class Ahorcado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palabraprincipal = "manzana";
		String[] anonimo = new String[palabraprincipal.length()];
		int vidas = 3;
		System.out.println("Bienvenido a ahorcado");
		//do {
			String palabra;
			System.out.println("Vidas restantes: "+vidas);
			for (int x = 0; x<anonimo.length; x++) {
				anonimo[x] = "_ ";
				System.out.print(anonimo + " ");
				}
			palabra = teclado.nextLine();
			for (int x = 0; x<palabraprincipal.length();x++) {
				if (palabra == palabraprincipal){
					anonimo[x] = palabra;
					System.out.println(anonimo);
				
				}
				
	
			 }

			}
	}
