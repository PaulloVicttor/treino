import java.util.Scanner;

public class exercicio4K {

	public static void main(String[] args) {
		
		
		Scanner s1 = new Scanner(System.in);
		int valorA;
		
		System.out.println("informe o valor desejado: ");
		valorA = s1.nextInt();
		
		switch (valorA) {
		case 1:
		case 2:
		case 3:
		case 4:	
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			
		System.out.println("O valor " + valorA + " está na faixa permitida");
			break;

		default:
			System.out.println("O valor " + valorA + " está fora da faixa permitida");
		}
		
	}
	
}
