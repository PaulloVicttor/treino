import java.util.Scanner;

public class exercicio3B {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		int N;
		
		System.out.println("coloque o valor: ");
		N = s1.nextInt();
		
		if( N < 0) {
		
			System.out.println("resultado: " + (N * -1));
			
		}else {
			System.out.println("resultado: " + N);	
		}
		
		
		
		
	}

}
