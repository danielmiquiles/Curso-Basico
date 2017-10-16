package AulasOnline;

import java.util.Scanner;

public class SistemaNotas2 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String[][]alunos = new String [600][3];
	double[][]notas = new double [600][3];
	double maiorMedia = Integer.MIN_VALUE;
	double menorMedia = Integer.MAX_VALUE;
	String melhorAluno = null;
	String piorAluno = null;
	int qtd =0;
	int op =0;
	
	while(op!=7){
		System.out.println("\nSistema de Notas - Menu");
		System.out.println(" 1 - Quantidade de Alunos");
		System.out.println(" 2 - Cadastro de Alunos ");
		System.out.println(" 3 - Exibir Alunos");
		System.out.println(" 4 - Atualizar Notas");
		System.out.println(" 5 - Exibir Maior Média");
		System.out.println(" 6 - Exibir Menor Média");
		op=sc.nextInt();
		
		
		if(op==1){
			System.out.print(" Digite a quantidade de alunos: ");
			qtd = sc.nextInt();
			alunos = new String[qtd][2];
			notas = new double [qtd][3];
			
		}
		 if(qtd==2){
			 if (qtd==0){
				 System.out.print("Informe a quantidade de alunos e suas notas antes de usar essa opção ");
			 }
			 for (int i = 0; i < qtd; i++) {
				
			}
		 }
		}
				
	}
	
	 
}

