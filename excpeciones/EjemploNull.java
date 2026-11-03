package excepciones;

public class EjemploNull {

	public static void main(String[] args) {
		String texto = null;
		try {
		int longitud = texto.length(); 
		System.out.println(longitud);
		}catch (NullPointerException a) {
			System.out.println("No hay texto: ");
			System.out.println(a);
		}
	}

}
