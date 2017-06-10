package AulasOnline;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Matriz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] M;

		M = new double[3][3];

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M.length; j++) {
				System.out.println("digite os números da matriz");
				M[i][j] = sc.nextDouble();
				
			}
			
		}
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M.length; j++) {
				System.out.println(M[i][j]+"\t");
			}
		}
		System.out.println();

	}
}
