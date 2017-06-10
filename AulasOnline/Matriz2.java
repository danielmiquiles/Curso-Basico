package AulasOnline;

import java.util.Scanner;

public class Matriz2 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int A=0,B=0;
	int[][] C;
	System.out.println("Informe a quantidade de linhas");
	A=sc.nextInt();
	System.out.println("Informe a quantidade de Colunas");
	B=sc.nextInt();
			
	C = new int [A][B];
	
	for (int i = 0; i < A; i++) {
		for (int j = 0; j < B; j++) {
			System.out.println("digite os números da matriz");
			C[i][j] = sc.nextInt();
			
		}
		
	}
	for (int i = 0; i <A; i++) {
		for (int j = 0; j < A; j++) {
			System.out.print(C[i][j]+"\t");
		}
	}
	System.out.println();
	
	
}
}
