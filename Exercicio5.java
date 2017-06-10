import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.println(" Digte o número que deseja conhecer a tabuada: ");
		i = sc.nextInt();
		
		for(int num = 0; num <= 10; num++){
			System.out.println( num + "x" + i + " = " + (num*i));
		}
	}
}
