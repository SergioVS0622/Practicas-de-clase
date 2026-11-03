package excepciones;

public class EjemploFormato {

	public static void main(String[] args) {
		String texto = "123abc";
		try {
		int numero = Integer.parseInt(texto);
		System.out.println("Numero convertido a entero: "+numero);
		}catch (NumberFormatException a) {
			System.out.println(a);
		}
	}

}
