package AulasOnline;

import java.util.Scanner;

public class MediadeNotasdeAlunoscomVetores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] Nota1, Nota2, Result;
		String[] nome;
		int qtdAlunos;
		System.out.println("Digite a quantidade de alunos: ");
		qtdAlunos = sc.nextInt();

		Nota1 = new double[qtdAlunos];
		Nota2 = new double[qtdAlunos];
		Result = new double[qtdAlunos];
		nome = new String[qtdAlunos];
		
		for (int i = 0; i < qtdAlunos; i++) {
			System.out.println("Digite o nome do aluno");
			nome[i] = sc.next();
			System.out.println(" Digite a primeira nota:");
			Nota1[i]= sc.nextDouble();
			System.out.println("Digite a segunda nota: ");
			Nota2[i] = sc.nextDouble();
			Result[i] = Nota1[i]+Nota2[i]/2;
			
			if (Result[i]>=7){
			System.out.println("Aluno "+ nome[i] +" Aprovado");
			
			}else{
				System.out.println("Aluno"+ nome[i] +"Reprovado");
			}
			}
			
		}
	}


