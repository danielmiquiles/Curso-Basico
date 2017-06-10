import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int qtdelementos;
		int elemento;
		int[] a;
		 
		System.out.println("Quantos elementos serão utilizados?");
		 qtdelementos = sc.nextInt();
		a = new int[qtdelementos];
		 
		
		 
		 
		 
for (int i = 0; i < qtdelementos; i++) {
	System.out.println("Digite o elemento = " + i);
	elemento = sc.nextInt();
	a[i] = elemento;
	
}
 
for (int i = qtdelementos - 1; i >= 0; i--) {
	System.out.println(" O elemento " + i + " é " + a[i]);
	
}
	}

	
}



