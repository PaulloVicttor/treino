import java.util.Scanner;

public class exercicio3D {
	
	public static void main(String[] args) {
		
		
		Scanner s1 = new Scanner(System.in);
		int N1;
		int N2;
		int N3;
		int N4;
		int NE = 0;
		
		System.out.println("insira o valor da nota N1: ");
		N1 = s1.nextInt();

		System.out.println("insira o valor da nota N2: ");
		N2 = s1.nextInt();
		
		System.out.println("insira o valor da nota N3: ");
		N3 = s1.nextInt();
		
		System.out.println("insira o valor da nota N4: ");
		N4 = s1.nextInt();
		
		int MD1 = (N1 + N2 + N3 + N4) /4;
		
		if(MD1 >= 7) {
			System.out.println("Aprovado com a mádia: " + MD1);
			return;
		}else {
			System.out.println("insira o quinta nota: ");
			 NE = s1.nextInt();
		}
		
		int MD2 = (MD1 + NE) / 2;
		
		if(MD2 >= 5) {
			System.out.println("Aprovado com a média: " + MD2);
		}else{
			System.out.println("Reprovado com a mádia: " + MD2);
		}
		
		
	}

}
