import java.util.Scanner;

public class exercicio4L {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		int valorA;
		
		System.out.println("informe o valor: ");
		valorA = s1.nextInt();
		
		if(valorA <=3) {
			System.out.println("valor menor que 3 " + valorA);
		}else {
			System.out.println("valor maior que 3");
		}
		
	}

}
