import java.util.Scanner;

public class exercicio4O {
	
	public static void main(String[] args) {
		
		
		Scanner s1 = new Scanner(System.in);
		int valorA;
		
		System.out.println("informe o valor A: ");
		valorA = s1.nextInt();
		
		int multiplicador = valorA * 2;
		
		if(multiplicador > 30) {
			System.out.println("resultado da multiplica��o: " + multiplicador);
		}else {
			System.out.println("valor para multiplica��o n�o atende aos requisitos !!");
		}
		
	}

}
