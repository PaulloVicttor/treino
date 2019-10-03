import java.util.Scanner;

public class exercicio4J {
	
	public static void main(String[] args) {
		
		
		
		
		Scanner s1 = new Scanner(System.in);
		int valor1;
		
		System.out.println("coloque valor 1: ");
		valor1 = s1.nextInt();
		
		if(valor1 % 2 == 0) {
			
			System.out.println("O valor informado é par: " + valor1);
			
		}else{
			System.out.println("O valor informado é impar: " + valor1);
		}
		
		
	}

}
