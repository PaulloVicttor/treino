import java.util.Scanner;

public class Hellow {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		int A;
		int B;
		System.out.println("valor A");
		A = s1.nextInt();
		
		System.out.println("valor B");
		B = s1.nextInt();
		
		if (A < B) {
			
			System.out.println("Valor A é menor que valor B " 
			+ "A diferença é de: " + (B - A));
			
		}if (B < A) {
			System.out.println("Valor B é menor que valor A " 
		+ "A diferença é de " + (A - B));
			
		}if(A == B) {
			System.out.println("Os valores são iguais otario");
		}
		
	}

}