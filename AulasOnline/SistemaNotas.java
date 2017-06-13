package AulasOnline;

import java.util.Scanner;

public class SistemaNotas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdAlunos = 0, op = 0, soma = 0;
		String[][] nomes;
		double[][] notas;
		double maMedia = Integer.MIN_VALUE;
		double meMedia = Integer.MAX_VALUE;
		String pAluno = null;
		String mAluno = null;

		while (op != 7){
			System.out.println();
			System.out.println(" -- MENU --");
			System.out.println(
					"\n1--INFORMAR QUANTIDADE DE ALUNOS \n2--INFORMAR NOME E NOTAS DOS ALUNOS \n3--INFORMAÇÕES DOS ALUNOS \n4--ATUALIZAR NOTAS"
							+ "\n5--MAIOR MEDIA \n6--MENOR MEDIA \n7--SAIR");
			op = sc.nextInt();

			if (op == 1) {
				System.out.println(" Digite a quantidade de Alunos: ");
				qtdAlunos = sc.nextInt();
			}
			nomes = new String[qtdAlunos][2];
			notas = new double[qtdAlunos][4];

			if (op == 2) {
				if (qtdAlunos == 0) {
					System.out.println(" Digite a quantidade de alunos e suas notas.");
				}
				for (int i = 0; i < qtdAlunos; i++) {
					System.out.println("  Digite o nome do " + (i + 1) + "º aluno. ");
					nomes[i][0] = sc.next();

					System.out.println(" Digite a 1ª nota do aluno " + nomes[i][0]);
					notas[i][0] = sc.nextDouble(); 

					System.out.println(" Digite a 2ª nota do aluno " + nomes[i][0]);
					notas[i][1] = sc.nextDouble();

					notas[i][2] = (notas[i][0] + notas[i][1]) / 2;
					
					nomes[i][0]=nomes[i][0].toUpperCase();

					if (notas[i][2] >= 5) {
						nomes[i][1] = "APROVADO";
					} else if (notas[i][2] < 5) {
						nomes[i][1] = "REPROVADO";
					}
					if (notas[i][2]>maMedia) {
						maMedia = notas[i][2];
						mAluno = nomes[i][0];
					}
					if (notas[i][0]<meMedia) {
						meMedia=notas[i][0];
						pAluno=nomes[i][0];
					}
				}
			}
			if (op==3) {
				if (qtdAlunos==0) {
					System.out.println(" Digite a quantidade de alunos e suas notas. ");
				}
				exibir(notas,nomes,qtdAlunos);
			}
			if (op==4) {
				if (qtdAlunos==0) {
					System.out.println(" Digite a quantidade de alunos e suas notas. ");
				}
				atualizar(notas);
			}
			if (op==5) {
				if (qtdAlunos==0) {
					System.out.println(" Digite a quantidade de alunos e suas notas. ");
				}
				maiorMedia(nomes);
			}
			if (op==6) {
				if (qtdAlunos==0) {
					System.out.println(" Digite a quantidade de alunos e suas notas. ");
				}
				menorMedia(nomes);
			}

		} 
	}
	public static double[][] exibir(double[][]notas, String[][]nomes, int qtdAlunos){
		
		for (int i = 0; i < qtdAlunos; i++) {
			
			notas=new double[qtdAlunos][3];
			System.out.println("Aluno(a):\t"+nomes[i][0]+" 1ª nota:\t"+notas[i][0]+" 2ª nota:\t"+notas[i][1]+" Média:\t"+notas[i][2]+" Status:\t"
		+nomes[i][0]);
		}
		return notas;
	
	}
public static double[][] atualizar(double[][]notas){
	Scanner sc = new Scanner(System.in);
	String buscanome, buscanota;
	String[][]nomes;
	double novanota;
	int qtdAlunos=0;
	
	nomes=new String[qtdAlunos][2];
	
	System.out.println(" Nome do Aluno ");
	buscanome=sc.next();
	
	for (int i = 0; i < notas.length; i++) {
		
		if (buscanome.equalsIgnoreCase(nomes[i][0])) {
			
			System.out.println(" Deseja atualizar a primeira nota ou a segunda? ");
			buscanota=sc.next();
			
			System.out.println(" Digite a nova nota: ");
			novanota=sc.nextDouble();
			
			if (buscanota.equalsIgnoreCase("primeira")) {
				notas[i][0]=novanota;
					} else if (buscanota.equalsIgnoreCase("segunda")) {
						notas[i][1]=novanota;
					}
			notas[i][2]=(notas[i][0]+notas[i][1])/2;
			
			System.out.println();
			System.out.println(" NOTAS ATUALIZADAS");
			System.out.println("Aluno(a):\t"+nomes[i][0]+" 1ª nota:\t"+notas[i][0]+" 2ª nota:\t"+notas[i][1]+" Média:\t"+notas[i][2]+" Status:\t"
		+nomes[i][0]);
			
			
		}
	}
	
	return notas;
}
public static void maiorMedia (String[][]nomes){
	double maMedia=0;
	String mAluno=null;
	System.out.println(" A maior media é: "+maMedia+" do aluno "+mAluno);
}
public static void menorMedia(String[][]nomes){
	double meMedia=0;
	String pAluno=null;
	System.out.println(" A menor média é: "+meMedia+" do aluno "+pAluno);
}
}
