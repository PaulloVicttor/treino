import java.util.Scanner;

public class exercicio3C {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		int N1;
		int N2;
		int N3;
		int N4;
			
		System.out.println("insira o valor da nota N1: ");
		N1 = s1.nextInt();

		System.out.println("insira o valor da nota N2: ");
		N2 = s1.nextInt();
		
		System.out.println("insira o valor da nota N3: ");
		N3 = s1.nextInt();
		
		System.out.println("insira o valor da nota N4: ");
		N4 = s1.nextInt();
		
		int MD = (N1 + N2 + N3 + N4) /4;
		
		if(MD >= 5) {
			System.out.println("Aprovado com a mádia: " + MD);
		}else {
			System.out.println("Reprovado com a média: " + MD);
		}
		
	}
	
}
