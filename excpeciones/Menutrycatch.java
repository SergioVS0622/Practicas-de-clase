package excepciones;

import java.util.Scanner;

public class Menutrycatch {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			int opciones=0;
			String n;
			do {
				System.out.println("MENU");
				System.out.println("Elija una opcion:");
				System.out.println("1-Comprar");
				System.out.println("2-Vender");
				System.out.println("3-Salir");
				n = teclado.nextLine();
				try {
					opciones = Integer.parseInt(n);
				}catch(NumberFormatException a ) {
				System.out.println(a);
				}
					switch(opciones) {
					case 1:
						comprar();
						break;
					case 2:
						vender();
						break;
					case 3:
						salir();
						break;
					default:
						System.out.println("Solo se admiten números del 1-3");
						break;
					}
			}while(opciones !=3);
			teclado.close();
	}
	public static void comprar() {
		System.out.println("Comprar");
		
	}
	public static void vender() {
		System.out.println("Vender");
	}
	public static void salir() {
		System.out.println("Aplicación terminada");
	}
}
