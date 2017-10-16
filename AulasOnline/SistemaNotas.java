package AulasOnline;

import java.util.Scanner;

public class SistemaNotas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtd = 0;
		double maior = Integer.MIN_VALUE;
		double menor = Integer.MAX_VALUE;
		String MaiorMedia = null;
		String MenorMedia = null;
		do {
			System.out.print("Insira a quantidade de alunos : ");
			qtd = sc.nextInt();
			System.out.println();
		} while (qtd < 1);

		String[] nome = new String[qtd];
		double[][] notas = new double[qtd][3];

		for (int i = 0; i < qtd; i++) {

			System.out.print("Insira o nome do aluno : ");
			nome[i] = sc.next();
			System.out.print("Insira a PRIMEIRA nota -> ");
			notas[i][0] = sc.nextDouble();
			System.out.print("Insira a SEGUNDA nota -> ");
			notas[i][1] = sc.nextDouble();

			notas[i][2] = (notas[i][0] + notas[i][1]) / 2;
			
			System.out.println();
		}
		
		int op=0;
		do {
			System.out.println();
			System.out.println("Insira uma das opções abaixo : ");
			System.out.println();
			System.out.println("----------Menu-----------");
			System.out.println("1- Exibir Alunos");
			System.out.println("2- Atualizar nota");
			System.out.println("3- Aluno de maior media");
			System.out.println("4- Aluno de menor media");
			System.out.println("0- Sair ");

			op = sc.nextInt();
			
			if (op == 1) {
				System.out.println("\t" + "Aluno" + "\t" + "Nota 1" + "\t" + "Nota 2" + "\t" + "Media" + "\t" + "Status");
				for (int i = 0; i < notas.length; i++) {
					if(notas[i][2] > 5){
					System.out.println("\t" + nome[i] + "\t" + notas[i][0] + "\t" + notas[i][1] + "\t" + notas[i][2] + "\t"
							+ "APROVADO");
					}else if(notas[i][2] < 5){
						System.out.println("\t" + nome[i]+ "\t" + notas[i][0] + "\t" + notas[i][1] + "\t" + notas[i][2] + "\t"
								+ "REPROVADO");
					}else{
						System.out.println("Erro!");
					}
				}
			} else if (op == 2) {
				String x;
				int z;
				double y;
				System.out.println("Qual aluno que precisa ter sua nota atualizada ? ");
				x = sc.next();

				for (int i = 0; i < nome.length; i++) {
					if (nome[i].equalsIgnoreCase(x)) {
						System.out.println("Que nota você deseja atualizar ?");
						System.out.println("Digite '1' para a PRIMEIRA nota! \nDigite '2' para a SEGUNDA nota!");
						z = sc.nextInt();

						switch (z) {

						case 1:
							System.out.print("Digite a nova nota : ");
							y = sc.nextDouble();
							notas[i][0] = y;
							notas[i][2] = (notas[i][0] + notas[i][1]) / 2;
							break;
						case 2:
							System.out.print("Digite a nova nota : ");
							y = sc.nextDouble();
							notas[i][1] = y;
							notas[i][2] = (notas[i][0] + notas[i][1]) / 2;
							break;
						default:
							System.out.println("Opção desconhecida,tente outra vez!");
						}

					}

				}

			} else if (op == 3) {
				for (int i = 0; i < notas.length; i++) {
					if (notas[i][2] > maior) {
						maior = notas[i][2];
						MaiorMedia = nome[i];
						
					}
				}
				System.out.println("O aluno com a maior média é " + MaiorMedia + " -> " + maior);
				

			} else if (op == 4) {
				for (int i = 0; i < notas.length; i++) {
					if (notas[i][2] < menor) {
						menor = notas[i][2];
						MenorMedia = nome[i];
					}
				}
				System.out.println("O aluno com menor média é " + MenorMedia + " -> " + menor);

			} else if (op == 0) {
				System.out.println("Programa Encerrado!");
				System.exit(0);
			}

		} while (op != 0);

	}

}