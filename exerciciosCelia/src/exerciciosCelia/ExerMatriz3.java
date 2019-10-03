package exerciciosCelia;

import java.util.Scanner;

public class ExerMatriz3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int valorLinha = 3;
		int valorColuna = 3;
		int soma = 0;

		int[][] matrizA = new int[valorLinha][valorColuna];
		int[] vetorA = new int[valorColuna];

		for (int contLinh = 0; contLinh < matrizA.length; contLinh++) {
			for (int contColun = 0; contColun < matrizA[contLinh].length; contColun++) {

				System.out.println("informe o valor desejado na coluna: ["+ contLinh + "] [" +
				contColun + "]: ");
				matrizA[contLinh][contColun] = scanner.nextInt();

			}
		}

		for (int contColun = 0; contColun < vetorA.length; contColun++) {
			for (int contLinh = 0; contLinh < matrizA[0].length; contLinh++) {

				vetorA[contColun] += matrizA[contLinh][contColun];
			}
		}

		for (int cont = 0; cont < vetorA.length; cont++) {
			System.out.print("Soma: " + vetorA[cont] + " ");

		}

	}

}
