package excepciones;

public class Division {

	public static void main(String[] args) {
		int numerador = 0;
		int denominador = 0;
		try {
		int resultado = numerador/denominador;
		System.out.println("Resultado: "+resultado);

		}catch(ArithmeticException a) {
			System.out.println("No se puede dividir por 0");
			System.out.println("objeto error :"+a);
			
		}
		}

	}
