package AulasOnline;
import java.util.Scanner;

public class ExercicioArrays2 {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] A, B;

			A = new int[8];
			B= new int[8];

			for (int i = 0; i <A.length; i++) {
				System.out.println("Entre com o elemento " + i + "->");
				A[i]=sc.nextInt();
				B[i]= A[i]*2;
				
				System.out.println(B[i]);
				
				System.out.println(A[i]);
				
				
			}
		}
	}


