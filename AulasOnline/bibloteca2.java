package AulasOnline;

import java.util.Scanner;

public class bibloteca2 {

	public static void main(String[] args) {
		String[][] livros;
		Scanner sc = new Scanner(System.in);
		int qtdLivros = 0, busca = 0, cad = 0, cont = 0;
		String nome, autor, status;

		System.out.println("Quantos livros tem em sua biblioteca? ");
		qtdLivros = sc.nextInt();
		livros = new String[qtdLivros][4];

		cadastro(livros);

		int op = 0;

		do {
			op = gerarMenu();
			if (op == 1) {
				System.out.println(" -- Procurar Livro -- ");
				do {
					busca = menuProcurar();
					if (busca == 1) {
						procurarportitulo(livros);
					} else if (busca == 2) {
						procurarporautor(livros);
					} else if (busca == 3) {
						verdisponiveis(livros);
					}

				} while (busca != 4);
			} else if (op == 2) {
				System.out.println("-- Emprestar Livro -- ");
				livros = emprestar(livros);
			} else if (op == 3) {
				System.out.println("-- Devolver Livro --");
				livros = devolver(livros);
			} else if (op == 4) {
				System.out.println("-- Ver todos os Livros --");
				verlivros(livros);
			} else if (op == 0) {
				System.out.println(" SAINDO ");
			} else {
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
			}

		}

	}

	public static String[][] emprestar(String[][] livros) { // Método para
															// emprestar livros
															// na bibioteca.
		Scanner sc = new Scanner(System.in);
		String busca, locatario;
		int cont = 1;
		System.out.println("\n");
		System.out.println("Digite o nome do livro ");
		busca = sc.next();

		for (int i = 0; i < livros.length; i++) {
			if (livros[i][0].equalsIgnoreCase(busca)) {
				if (livros[i][2].equalsIgnoreCase("EMPRESTADO")) {
					System.out.println(" Livro Emprestado!! Escolha outro!!");

				} else {
					System.out.println(" Digite seu nome ");
					locatario = sc.next();
					livros[i][3] = locatario.toUpperCase();
					livros[i][2] = "EMPRESTADO";
					System.out.println(" Livro Emprestado!! \0/ \n");
					cont++;

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
		int cont = 0;
		System.out.println("\n");
		System.out.println("Digite o nome do livro ");
		busca = sc.next();

		for (int i = 0; i < livros.length; i++) {
			if (livros[i][0].equalsIgnoreCase(busca)) {
				if (livros[i][2].equalsIgnoreCase("DISPONIVEL")) {
					System.out.println("Livro já DISPONIVEL");

				} else {

					livros[i][2] = "DISPONIVEL";
					livros[i][3] = "VAZIO";
					System.out.println(" Livro Devolvido");
					cont--;
				}
				return livros;

			}

		}
		System.out.println(" Livro não encontardo");
		return livros;

	}

	public static void verlivros(String[][] livros) {
		for (int i = 0; i < livros.length; i++) {
			System.out.println("Nome\t" + livros[i][0] + " Autor\t" + livros[i][1] + " Status\t" + livros[i][2]
					+ " locatario\t" + livros[i][3]);
		}

	}

	public static int menuProcurar() {
		Scanner sc = new Scanner(System.in);

		System.out.println(" 1-- Procurar por  Titulo ");
		System.out.println(" 2-- Procurar por Autor ");
		System.out.println(" 3-- Mostrar todos os disponiveis ");
		System.out.println(" 4-- Sair ");
		int busca = sc.nextInt();

		return busca;

	}

	public static void procurarportitulo(String[][] livros) {
		Scanner sc = new Scanner(System.in);
		String busca;

		System.out.println("\n");
		System.out.println("Qual o nome do livro? ");
		busca = sc.next();

		for (int i = 0; i < livros.length; i++) {
			if (livros[i][0].equalsIgnoreCase(busca)) {
				System.out.println("Nome \t" + livros[i][0] + " Autor \t" + livros[i][1] + " Status \t" + livros[i][2]
						+ " locatario \t" + livros[i][3]);
			}
		}
		System.out.println("Nome incorreto!! Tente novamente.");
	}

	public static void procurarporautor(String[][] livros) {
		Scanner sc = new Scanner(System.in);
		String busca;

		System.out.println("\n");
		System.out.println("Qual o autor do livro? ");
		busca = sc.next();

		for (int i = 0; i < livros.length; i++) {
			if (livros[i][1].equalsIgnoreCase(busca)) {
				System.out.println("Nome \t" + livros[i][0] + " Autor \t" + livros[i][1] + " Status \t" + livros[i][2]
						+ " locatario \t" + livros[i][3]);

			}

		}
		System.out.println("Autor incorreto!! Tente Novamente.");
	}

	public static void verdisponiveis(String[][] livros) {

		for (int i = 0; i < livros.length; i++) {
			if (livros[i][2].equalsIgnoreCase("DISPONIVEL")) {
				System.out.println("Nome\t" + livros[i][0] + " Autor\t" + livros[i][1] + " Status\t" + livros[i][2]
						+ " locatario\t" + livros[i][3]);
			}
		}
	}

	public static int quantidadeDeLivros(String[][] livros) {
		int cont = 0;
		for (int i = 0; i < livros.length; i++) {
			if (livros[i][0] != null) {
				cont++;
			} else {
				i = livros.length;
			}
		}
		return cont;
	}

	public static void cadastro(String[][] livros) {
		Scanner sc = new Scanner(System.in);
		String nome = null, autor, status, op2;
		int qtdLivros = 0, cont = 0;
		for (int i = 0; i < livros.length; i++) {

			do {
				System.out.println(" Deseja cadastrar mais um livro?");
				System.out.println(" SIM ");
				System.out.println(" NAO ");
				op2 = sc.next();
				System.out.println();
				if (op2.equalsIgnoreCase("SIM")) {
					System.out.println(" Vamos ao cadastro \n");
					System.out.println(" Nome do livro ");
					nome = sc.next();
					System.out.println(" Informe o nome do Autor: ");
					autor = sc.next();
					System.out.println(" Informe o status: ");
					status = sc.next();
					System.out.println();
					System.out.println(" LIVRO CADASTRADO COM SUCESSO.");
					System.out.println();
					System.out.println(" Você ainda pode cadastrar " + (qtdLivros - 1) + " livros ");
					System.out.println();

					cont++;
					livros[i][0] = nome.toUpperCase();
					livros[i][1] = autor.toUpperCase();
					livros[i][2] = status.toUpperCase();
				} else if (op2.equalsIgnoreCase("nao")) {
					if (cont == 0) {
						System.out.println(" CADASTRE PELO MENOS UM LIVRO NA BIBLITECA");
						System.out.println();
					}
				} else if (nome.equalsIgnoreCase(livros[i][0])) {
					System.out.println(" Livro já cadastrado. Informe outro livro");
				}

			} while (cont <= qtdLivros);
		}
		if (cont >= qtdLivros) {
			System.out.println(" Biblioteca na capacidade maxima, você não pode mais cadastrar livros.");

		}
	}

}
