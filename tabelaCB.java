import java.util.Scanner;

public class tabelaCB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] times, times2;
		int[] vitorias, empates, sdg;

		int qtdTimes, qtdPontos = 0, QtdDeJogosPorTimes;

		System.out.println(" Informar quantidades de times: ");
		qtdTimes = sc.nextInt();

		QtdDeJogosPorTimes = (qtdTimes - 1) * 2;

		times = new String[qtdTimes];
		times2 = new String[qtdTimes];
		vitorias = new int[qtdTimes];
		empates = new int[qtdTimes];
		sdg = new int[qtdTimes];

		for (int i = 0; i < qtdTimes; i++) {
			System.out.println("Informe o nome do Time: " + i + "--->");
			times[i] = sc.next();
			times2[i] = times[i];

		}
		for (int i = 0; i < qtdTimes; i++) {
			System.out.print(" Time " + i + "-->" + times[i]);
		}
		for (int i = 0; i < qtdTimes; i++) {
			System.out.print(" Time " + i + "-->" + times2[i]);
		}
		for (int i = 0; i < qtdTimes; i++) {
			for (int j = 0; j < qtdTimes; j++) {
				if (!times[i].equals(times2[j])) {
					System.out.println(times[i] + " X " + times2[j]);

				}

			}

		}

		for (int i = 0; i < qtdTimes; i++) {
			do {

				System.out.print("Quantas vitórias tem o time" + times[i] +"--");
				vitorias[i] = sc.nextInt();
				System.out.print("Quantos empates tem o time"  + times[i]+ "--");
				empates[i] = sc.nextInt();
				System.out.print("Qual o saldo de gol do time" + "--" + times[i]+ "--");
				sdg[i] = sc.nextInt();
				qtdPontos = (empates[i] * 1) + (vitorias[i] * 3);
						if (vitorias[i] + empates[i] > QtdDeJogosPorTimes) {
					System.out.println(" Valores errados, tente novamente!!! ");
				}
			} while (vitorias[i] + empates[i] > QtdDeJogosPorTimes);
			

		}

		System.out.println("Times\tVitórias\tSaldo de Gols\tEmpates\tPontuação");
		for (int i = 0; i < qtdTimes; i++) {
			System.out.println(times[i] + "\t" + vitorias[i] + "\t" + sdg[i] + "\t" + empates[i]+ "\t" + qtdPontos);

		}
	}
}
