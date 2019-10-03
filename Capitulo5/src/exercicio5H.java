import java.util.Scanner;

public class exercicio5H {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int base;
		int expo;
		int result = 1;
		
		System.out.println("informe a base");
		base = entrada.nextInt();
		
		System.out.println("informe o expoente");
		expo = entrada.nextInt();
		
			for (int cont = 0; cont < expo; cont++) {

				result = result * base;
			}
			System.out.println("Resposta: " + result);
	}

}
