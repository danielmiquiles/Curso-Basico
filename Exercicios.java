import java.util.Scanner;

public class Exercicios {
	public static void main(String[] args) {
		// capitura valores digitados.
		Scanner sc = new Scanner(System.in);
		//declaração de variaveis
		double nota1, nota2, mediaaluno;
				
		System.out.println(" Entre com a PRIMEIRA nota: ");
				nota1 = sc.nextDouble();
		System.out.println(" Entre com a SEGUNDA nota: ");
		nota2 = sc.nextDouble();
		mediaaluno = (nota1+nota2)/2;
		
		if (mediaaluno>=5){
			System.out.println("Aprovado com Média "+mediaaluno);
		}
			else if (mediaaluno<5 && mediaaluno>=3){
				System.out.println("Na Final ");
					}else{
						System.out.println("Reprovado com Média "+ mediaaluno);
					}

	}

}
