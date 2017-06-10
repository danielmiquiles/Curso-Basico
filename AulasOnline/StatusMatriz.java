package AulasOnline;

import java.util.Scanner;

public class StatusMatriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nomes;
		double[][] nfs;
		int qtd = 0;
	

		System.out.println("Quantos alunos tem a turma? ");
		qtd = sc.nextInt();

		nomes = new String[qtd];
		nfs = new double[qtd][6];

		for (int i = 0; i < qtd; i++) {
			System.out.println("digite o nome do " + (i + 1)+"º" + " aluno ");
			nomes[i] = sc.next();

			for (int k = 0; k < 6; k++) {
				if (k < 3) {
					System.out.println(" Digite a nota " + (k + 1) + " do aluno " + nomes[i] + " : ");
					nfs[i][k] = sc.nextInt();
				} else if (k == 3) {
					System.out.println(" Digite o numeros de faltas " + " do aluno " + nomes[i] + " : ");
nfs[i][3]=sc.nextInt();
				} // fim do else if
			} // fim do for 2
		} // fim do for 1
		for (int i = 0; i < qtd; i++) {
			for (int j = 0; j < 6; j++) {

				if (j < 3) {
					nfs[i][4] += nfs[i][j];
				} // fim if
			}// fim do for 2

			nfs[i][5] = nfs[i][4] / 3;
			if (nfs[i][5] >= 5 && nfs[i][3] < 15) {
				System.out.println(nomes[i] + " teve média " + nfs[i][5] + " e foi APROVADO!");
			} else if (nfs[i][5] >= 5 && nfs[i][3] > 15) {
				System.out.println(nomes[i] + " teve média " + nfs[i][5] + " e foi REPROVADO POR FALTA!");
			} else if (nfs[i][5] < 5) {
				System.out.println(nomes[i] + " teve média " + nfs[i][5] + " e foi REPROVADO!");
			}// FIM DA IMPRESSÃO
			
		}// FIM DO FOR 1
	}// FIM DO MAIN
}// FIM DA CLASSE
