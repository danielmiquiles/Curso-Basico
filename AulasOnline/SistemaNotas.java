package AulasOnline;

import java.util.Scanner;

public class SistemaNotas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdAlunos,op, soma=0;
		String[] nomes;
		double[][] notas;

		menu(op);
		do{
		if (op==1) {
			System.out.println(" Quantos alunos tem na turma? ");
			qtdAlunos=sc.nextInt();
			notas = new double[qtdAlunos][5];
					}
		else if(qtdAlunos==0){
			System.out.println(" Informe um quantidade valida de Alunos.");
					}
		else if (op==2) {
			for (int i = 0; i < notas.length; i++) {
				for (int k = 0; k < notas.length; k++) {
													System.out.println(" Digite o nome do "+(i+1)+"º"+" aluno");
				nomes[i]=sc.next();
				if (i<2) {
	System.out.println(" Digite a "+(i+1)+"ª"+" aluno ");
	notas[i][k] = sc.nextDouble();
	soma+=notas[i][k];
				}
				}
			}
		}
		}while();
	}

	public static void menu(int op) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" 1-- Informar quantidade de alunos na turma. ");
		System.out.println(" 2-- Informar nome dos alunos e suas notas. ");
		System.out.println(" 3-- Exibir nomes, notas, media e status dos alunos. ");
		System.out.println(" 4-- Atualizar Notas. ");
		System.out.println(" 5-- Exibir nome do Aluno com maior média e a média. ");
		System.out.println(" 6-- Exibir nome do Aluno com menor média e a média. ");
		op = sc.nextInt();
	}
}
