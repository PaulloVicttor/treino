import java.util.Scanner;

public class exercicio4N {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		int valorA;
		int valorB;
		int valorC;
		
		System.out.println("informe o valor A: ");
		valorA = s1.nextInt();
		
		System.out.println("informe o valor B: ");
		valorB = s1.nextInt();
		
		System.out.println("informe o valor C: ");
		valorC = s1.nextInt();
		
		int soma = valorA + valorB + valorC;
		
		if(soma >= 100) {
			System.out.println("resultado: " + soma);
		}else {
			System.out.println("soma dos três valores é menor que 100 !");
		}
	}

}
