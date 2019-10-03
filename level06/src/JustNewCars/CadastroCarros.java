package JustNewCars;

import java.util.Scanner;

public class CadastroCarros {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int quantVeiculos = 0;

		Veiculo[] veiculos = new Veiculo[quantVeiculos];

		Veiculo veiculo = new Veiculo();

		System.out.println("digite aquantidade de veiculos para cadastrar: ");
		quantVeiculos = scanner.nextInt();

		for (int cont = 0; cont < quantVeiculos; cont++) {

			System.out.println("digite o Ano");
			veiculo.setAno(scanner.nextInt());

			System.out.println();

			System.out.println("digite a Marca");
			veiculo.setMarca(scanner.next());

			System.out.println();

			System.out.println("digite o Modelo");
			veiculo.setModelo(scanner.next());

			System.out.println();

			System.out.println("digite o numero do carro 0 Hatch, 1 Sedã, 2 Picape, 3 Minivan, 4 Perua, 5 SUV");
			Veiculo.Tipo.Hatch.ordinal();
			int tipoCarro = 0;
			Veiculo.Tipo tipo;

			switch (tipoCarro) {
			case 0:
				tipo = Veiculo.Tipo.Hatch;
				break;

			case 1:
				tipo = Veiculo.Tipo.Sedã;
				break;

			case 2:
				tipo = Veiculo.Tipo.Picape;
				break;

			case 3:
				tipo = Veiculo.Tipo.Minivan;
				break;

			case 4:
				tipo = Veiculo.Tipo.Perua;
				break;

			case 5:
				tipo = Veiculo.Tipo.SUV;
				break;

			default:
				System.out.println("Proximo carro");

			}

		}
	}
}
