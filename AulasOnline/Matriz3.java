package AulasOnline;

import java.util.Scanner;

public class Matriz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0;
		int soma =0;
		int[][] B, C, D, E, F;

		System.out.println("Informe o Tamanho da Matriz");
		A = sc.nextInt();

		B = new int[A][A];
		C = new int[A][A];
		D = new int[A][A];
		E = new int[A][A];
		F = new int[A][A];
		for (int i = 0; i < A; i++) {
			for (int j = 0; j < A; j++) {
				System.out.println("digite os elementos "+i+" -- "+j+ " da matriz");
				B[i][j] = sc.nextInt();

			}

		}

		for (int i = 0; i < A; i++) {
			for (int j = 0; j < A; j++) {
				System.out.println("digite os elementos "+i+" -- "+j+ " da matriz");
				C[i][j] = sc.nextInt();

			}

		}
		for (int i = 0; i < A; i++) {
			for (int j = 0; j < A; j++) {
				D[i][j]+= B[i][j]+C[i][j];
				
			}
		}
		
		for (int i = 0; i < A; i++) {
			for (int j = 0; j < A; j++) {
				E[i][j]-= B[i][j]-C[i][j];
		

	}
}
		for (int i = 0; i < A; i++) {
			for (int j = 0; j < A; j++) {
				F[i][j]+=B[i][j]*C[j][i];
				
			}
			
		}
		for (int i = 0; i < A; i++) {
			for (int j = 0; j <A; j++) {
				
			
		
		System.out.println("------SOMA----");
		System.out.println(D[i][j]);
		System.out.println("-----SUBTRAÇÃO---");
		System.out.println(E[i][j]);
		System.out.println("----MULTIPLICAÇÃO---");
		System.out.println(F[i][j]);
		}
		}
		
	}
	}
