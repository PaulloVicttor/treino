
public class exercicio5J {

	public static void main(String[] args) {

		double GCelsius = 10;
		double GFahrenheit = 10;

		while (GCelsius <= 100) {

			GFahrenheit = GCelsius * 1.8 + 32;

			System.out.println("Graus celcios: " + GCelsius);
			System.out.println("Graus Fahrenheit: " + GFahrenheit);
			System.out.println("");

			GCelsius = GCelsius + 10;

		}

	}

}
