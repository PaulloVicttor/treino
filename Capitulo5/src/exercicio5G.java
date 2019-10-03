
public class exercicio5G {

	public static void main(String[] args) {

		int base = 3;
		int expo = 0;
		int result = 1;

		for (expo = 0; expo < 16; expo++) {

			for (int cont = 0; cont < expo; cont++) {

				result = result * base;

				System.out.println(result);
			}

		}

	}
}
