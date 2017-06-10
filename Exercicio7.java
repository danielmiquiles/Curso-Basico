import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		double nota1, nota2, mediaNota;
		String nomeAluno;
		for (int alunos = 1; alunos <= 30; alunos++) {
			
			System.out.println(" Digite o nome do Aluno: ");
			nomeAluno = sc.next();
			
			System.out.println(" Digite a primeira nota do aluno: ");
			nota1 = sc.nextDouble();
			
			System.out.println(" Digite a segunda nota do aluno: ");
			nota2 = sc.nextDouble();
			
			mediaNota = nota1 + nota2/2;
			
			if(mediaNota >= 7){
				System.out.println("O aluno" + nomeAluno + "Obteve média" + mediaNota + " e está APROVADO");
				
			}else if (mediaNota < 7 && mediaNota >= 3){
				System.out.println("O aluno" + nomeAluno + "Obteve média" + mediaNota +  " e está na RECUPERAÇÃO");
				
			}else{
				System.out.println("O aluno" + nomeAluno + "Obteve média" + mediaNota + " e está REPROVADO");
			}
				
			
			
			
		}
	}
}
