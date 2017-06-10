import java.util.Scanner;

public class Financiamento {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdParcelas;
		double txJuros, valorFinan, valorParcelas, valorTotal = 0, valorJuros;

		System.out.print(" Entre com a Valor desejador para ser financiado: ");
		valorFinan = sc.nextDouble();

		System.out.print(" Digite a taxa de juros que deseja: ");
		txJuros = sc.nextDouble();

		System.out.print(" Digite a quantidade de parcelas que deseja: ");
		qtdParcelas = sc.nextInt();

		valorJuros = valorFinan * 1 + (txJuros / 100);
		valorParcelas = (valorFinan + valorJuros) / qtdParcelas;

		for (int meses = 1; meses <= qtdParcelas; meses++) {

			valorTotal += valorParcelas;

		}
		System.out.println(" O valor Total é: " + valorTotal);
		System.out.println(" O valor dos juros é: " + valorJuros);
		System.out.println(" O valor de cada parcela é: " + valorParcelas);

	}

}
