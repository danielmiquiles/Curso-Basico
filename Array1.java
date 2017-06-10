import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdelementos;
		int[] a;
		int menor_valor = Integer.MAX_VALUE;
		int maior_valor = Integer.MIN_VALUE;
		double media = 0;
		int posiçao_menor=0;
		int posiçao_maior=0;

		System.out.print(" Digite a quantidades de elementos: ");
		qtdelementos = sc.nextInt();
		a = new int[qtdelementos];

		for (int i = 0; i < qtdelementos; i++) {
			System.out.print("informe o elemento: " + i + " - ");
			a[i] = sc.nextInt();
			
			if (a[i]>maior_valor) {
				maior_valor=a[i];
				posiçao_maior = a[i];
				
			}
			if (a[i]<menor_valor) {
				menor_valor=a[i];
				posiçao_menor= a[i];
				
			}
            media +=a[i];
		}
		System.out.println("-------- Pares------");
		for (int i = 0; i < qtdelementos; i++) {
			if ( a[i]%2==0){
				System.out.print(" O elemento " +i+ " é " +a[i] + "- " + "\n");
				
		}}
		System.out.println("-------Impares------");
		for (int i = 0; i < qtdelementos; i++) {
			if (a[i]%2!=0){
				System.out.print(" O elemento " +i+ " é " +a[i] + "-" + "\n");
				
		}
			
			
		System.out.println(menor_valor);
		System.out.println(maior_valor);
		System.out.println(media);
		System.out.println(" O maior número está alocado no: "+ posiçao_maior);
		System.out.println(" O menor número está alocado no: " + posiçao_menor);
		
		}

	}
}




