import java.util.Scanner;

public class exercicio4M {
	
	public static void main(String[] args) {
		
//		String M = "M";
//		String F = "F";
		
		
		Scanner s1 = new Scanner(System.in);
		String nome;
		String sexo;
		
		System.out.println("informe seu nome: ");
		nome = s1.next();
		
		System.out.println("informe seu sexo: ");
		sexo = s1.next();
		
		switch (sexo) {
		case "M":
		case "F":
			
			System.out.println("");
			
			break;

		default:
			System.out.println("Sexo informado invalido");
		}
		
		switch (sexo) {
		case "M":
			
			System.out.println("Ilma. Sr. " + nome);
			
			break;
			
		case "F":
			System.out.println("Ilma. Sra. " + nome);
			
			break;

		default:
			
		}
		
			}
		
	}



