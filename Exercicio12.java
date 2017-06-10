import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		char N=0;
		double N1, N2;
		
		while (N != 'h'){
			
		System.out.println(" a - Adição ");
		System.out.println(" b - Subtração ");
		System.out.println(" c - Multiplicação ");
		System.out.println(" d - Quociente da divisão ");
		System.out.println(" e - Resto da divisão ");
		System.out.println(" f - Potenciação ");
		System.out.println(" g - Adição ");
		System.out.println(" h - SAIR ");
		N = sc.next().charAt(0);
		 
		System.out.println(" Digite o primeiro número: ");
			N1 = sc.nextDouble();
			System.out.println(" Digite o segundo número: ");
			N2 = sc.nextDouble();
			
			if(N == 'a'){
				System.out.println(N1 + N2);
			}
			
			else if(N == 'b'){
				System.out.println(N1-N2);
			}
			
			else if(N == 'c'){
				System.out.println(N1*N2);
		    }
			
			else if(N == 'd'){
				System.out.println(N1/N2);
			}
			
			else if(N == 'e'){
				System.out.println(N1%N2);
			}
			
			else if(N == 'f'){
				System.out.println(Math.pow(N1, N2));
	        }
			
			else if(N == 'g'){
				System.out.println(N1+N2/2);
			}
			
			else if(N == 'h'){
				System.exit(0);
			}
			
			else{
				System.out.println(" Escolha inválida ");
			}
				}
			}

}
