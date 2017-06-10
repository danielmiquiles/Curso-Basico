package AulasOnline;

import java.util.Scanner;

public class ExercicioArrays4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A;
		int soma = 0;
		
		A = new int[10];
		
		for (int i = 0; i <A.length; i++) {
			System.out.println("Entre com o elemento " + i + "->");
			A[i]=sc.nextInt();
			soma+=A[i];
		System.out.println(soma);
			
			
			
		}
	}
}
