import java.util.Scanner;

public class exencicio4H {
	
	public static void main(String[] args) {
		
		
		
		Scanner s1 = new Scanner(System.in);
		int valA;
		int valB;
		int valC;
		int valD;
		
		System.out.println("Valor A: ");
		valA = s1.nextInt();
		
		System.out.println("Valor B: ");
		valB = s1.nextInt();
		
		System.out.println("Valor C: ");
		valC = s1.nextInt();
		
		System.out.println("Valor D: ");
		valD = s1.nextInt();
		
		if(valA % 2 == 0 || valA % 3 == 0) {
			System.out.println("OK: " + valA);
			
		}if(valB % 2 == 0 || valB % 3 == 0) {
			System.out.println("OK: " +valB);
			
		}if(valC % 2 == 0 || valC % 3 == 0) {
			System.out.println("OK: " + valC);
			
		}if(valD % 2 == 0 || valD % 3 == 0) {
			System.out.println("OK: " + valD);
			
		}
		
		
	}

}
