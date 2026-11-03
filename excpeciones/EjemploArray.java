package excepciones;

public class EjemploArray {

	public static void main(String[] args) {
		try {
		int[] numeros = {10, 20, 30};
		int valor = numeros[5];
		System.out.println("El valor es :"+valor);
		}catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a); 
		}
	}

}
