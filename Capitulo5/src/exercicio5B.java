import java.util.Scanner;

public class exercicio5B {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int numeroA;
		int numeroB = 1;
		
		System.out.println("informe o numero da tabuada:");
		numeroA = scanner.nextInt();
		
		System.out.println();
		
		while (numeroB < 11) {
			System.out.println(numeroB * numeroA);
			
			numeroB++;
			
		}
		
	}

}
