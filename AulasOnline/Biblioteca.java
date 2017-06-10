package AulasOnline;

import java.util.Scanner;

public class Biblioteca {
	public static void main(String[] args) {
		String[][] livros;
		Scanner sc = new Scanner(System.in);
		int qtdLivros;
		String nome, autor, status;

		System.out.println("Quantos livros tem em sua biblioteca? ");
		qtdLivros = sc.nextInt();

		System.out.println("Massa... Agora cadastre seus livros ");

		livros = new String[qtdLivros][3];

		for (int i = 0; i < qtdLivros; i++) {
			System.out.println("Qual  nome do livro? ");
			nome = sc.next();
			System.out.println("Qual o autor do livro? ");
			autor = sc.next();
			System.out.println("Qual o status do livro? ");
			status = sc.next();

			livros[i][0] = nome.toUpperCase();
			livros[i][1] = autor.toUpperCase();
			livros[i][2] = status.toUpperCase();

		}
		int op = 0;
		
		do {
			op = gerarMenu();
			if (op == 1) {
				System.out.println(" -- Procurar Livro -- ");
				procurarlivros(livros);
			}
			else if (op == 2) {
				System.out.println("-- Emprestar Livro -- ");
				livros = emprestar(livros);
			}
			else if (op == 3) {
				System.out.println("-- Devolver Livro --");
				livros = devolver(livros);
			}
			else if (op == 4) {
				System.out.println("-- Ver todos os Livros --");
				verlivros(livros);
			}
			else if (op == 0) {
				System.out.println(" SAINDO ");
			}
			else{
				System.out.println(" Opção Incorreta, tente novamente!! ");
			}

		} while (op != 0);

	}

	public static int gerarMenu() { // Função do Menu.
		Scanner sc = new Scanner(System.in);

		System.out.println("-------Menu------");
		System.out.println(" 1 -- Procurar Livro ");
		System.out.println(" 2 -- Emprestar Livro ");
		System.out.println(" 3 -- Devolver Livro ");
		System.out.println(" 4 -- Ver todos os Livros ");
		System.out.println(" 0 -- SAIR ");
		int op = sc.nextInt();
		return op;

	}

	public static void procurarlivros(String[][] livros) { // Método para
															// procurar livros
															// na biblioteca.

		Scanner sc = new Scanner(System.in);
		String busca;

		System.out.println("\n");
		System.out.println("Qual o nome do Livro? ");
		busca = sc.next();

		for (int i = 0; i < livros.length; i++) {
			if (livros[i][0].equalsIgnoreCase(busca)) {
				System.out.println("Nome \t" + livros[i][0] + "  Autor \t" + livros[i][1] + "  Status \t" + livros[i][2]);
			}

		}

	}

	public static String[][] emprestar(String[][] livros) { // Método para
															// emprestar livros
															// na bibioteca.
		Scanner sc = new Scanner(System.in);
		String busca;
		System.out.println("\n");
		System.out.println("Digite o nome do livro ");
		busca = sc.next();

		for (int i = 0; i < livros.length; i++) {
			if (livros[i][0].equalsIgnoreCase(busca)) {
				if (livros[i][2].equalsIgnoreCase("EMPRESTADO")) {
					System.out.println(" Livro Emprestado!! Escolha outro!!");

				} else {
					livros[i][2] = "EMPRESTADO";
					System.out.println(" Livro Emprestado!! \0/ \n");
				}
				return livros;

			}

		}
		System.out.println(" Livro não Encontrado ");
		return livros;

	}

	public static String[][] devolver(String[][] livros) {
		Scanner sc = new Scanner(System.in);
		String busca;
		System.out.println("\n");
		System.out.println("Digite o nome do livro ");
		busca = sc.next();

		for (int i = 0; i < livros.length; i++) {
			if (livros[i][0].equalsIgnoreCase(busca)) {
				if (livros[i][2].equalsIgnoreCase("DISPONIVEL")) {
					System.out.println("Livro já DISPONIVEL");

				} else {
					livros[i][2] = "DISPONIVEL";
					System.out.println(" Livro Devolvido");

				}
				return livros;

			}

		}
		System.out.println(" Livro não encontardo");
		return livros;

	}

	public static void verlivros(String[][] livros) {
		for (int i = 0; i < livros.length; i++) {
			System.out.println("Nome \t" + livros[i][0] + " Autor \t" + livros[i][1] + " Status \t" + livros[i][2]);
		}

	}
}
