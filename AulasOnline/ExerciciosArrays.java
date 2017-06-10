package AulasOnline;

import java.util.Scanner;

public class ExerciciosArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A, B;

		A = new int[5];
		B = new int[5];

		for (int i = 0; i <A.length; i++) {
			System.out.println("Entre com o elemento " + i + "->");
			A[i]=sc.nextInt();
			B[i]= A[i];
			
			System.out.println(B[i]);
			
			System.out.println(A[i]);
			
			
		}
	}
}
