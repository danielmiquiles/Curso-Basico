package AulasOnline;

import java.util.Scanner;

public class bibloteca2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String nome, autor, status,nomes;
		int escolha;
		
		System.out.println("Digite a quantidade maxima de livros:");
		int quantidade= sc.nextInt();
		System.out.println("Ok! Escolha 1 para cadastrar os livros!");
		String [][]livros= new String[quantidade][4];
		
		menu();
		escolha = sc.nextInt();

		while(escolha != 0){	

			if(escolha == 1){
				Cadastrar(livros);
			}
			else if(escolha == 2){
				MenuProcurar(livros);
			}
			else if(escolha == 3){
				EmprestarLivro(livros);
			}
			else if(escolha == 4){
				VerTodosOsLivros(livros);
			}	
			else if(escolha == 5){
				DevolverLivro(livros);
			}
			else if(escolha == 6){
				ImprimirRelatorio(livros);
			
			}else{
				System.out.println("ERRO. Escolha novamente");
			}
			menu();
			escolha=sc.nextInt();
			System.out.println("");

		}
		if(escolha == 0){
			System.out.println("Você saiu do programa");
		} 
	}

	//----------------------------------------------------------------------------------------------------------------------------------

	public static void menu(){

		System.out.println("");
		System.out.println("");
		System.out.println("----Escolha uma das opções----");
		System.out.println("");
		System.out.println("1- Cadastrar livros");
		System.out.println("2- Procurar livro");
		System.out.println("3- Emprestar livro");
		System.out.println("4- Ver todos os livros");
		System.out.println("5- Devolver");
		System.out.println("6- Imprimir relatório");
		System.out.println("0- SAIR");
		System.out.flush();
	}	
	//-----------------------------------------------------------------------------------------------------------------------------------
	public static int MenuProcurar(String[][]livros){
		Scanner sc= new Scanner(System.in);

		System.out.println("Selecione a opçao que deseja procurar: ");
		System.out.println("\n1- Procurar Titulo \n2- Procurar por autor \n3- Exibir todos os disponiveis");
		int opcao= sc.nextInt();

		if(opcao ==1){
			ProcurarTitulo(livros);

		}else if(opcao ==2){
			ProcurarAutor(livros);

		}else if(opcao ==3){
			ExibirDisponiveis(livros);
		}
		return opcao;
	}

	//------------------------------------------------------------------------------------------------------------------------------------

	public static String[][] EmprestarLivro(String[][]livros){	
		Scanner sc = new Scanner(System.in);
		String busca, nomeP;
		boolean encontrou = false;
		int posicao = 0;
		int qntEmprestimo = 0;
		
		System.out.println("Informe o nome do livro: ");
		busca = sc.next();
		
		System.out.println("Informe seu nome: ");
		nomeP = sc.next();
		
		
		for(int i=0; i<livros.length; i++) {
			if(livros[i][0] != null){
				if(livros[i][0].equalsIgnoreCase(busca)) {
					encontrou = true;
					posicao=i;
				}
			}
		}
		for(int i=0; i<livros.length; i++) {
			if(livros[i][3]!= null){
			if(livros[i][3].equalsIgnoreCase(nomeP)) {
				qntEmprestimo++;
			}
		}
	}
		
		if(encontrou == true) {
			if(livros[posicao][2].equalsIgnoreCase("EMPRESTADO")){
				System.out.println("Livro INDISPONIVEL no momento.");
				
				}
				
				if(livros[posicao][2].equalsIgnoreCase("DISPONIVEL") && qntEmprestimo < 3){
					livros[posicao][2] = "EMPRESTADO";
					livros[posicao][3] = nomeP.toUpperCase();
				
				System.out.println("");
				System.out.println("Livro alugado com sucesso! Favor, pegar na recepção!");
				
				}
			
				if(livros[posicao][2].equalsIgnoreCase("DISPONIVEL") && qntEmprestimo == 3){
				System.out.println("Ops! Você atingiu o limite de livros!");
				
				}
		}
				
				
			if(encontrou == false){
				System.out.println("Esse livro não existe");
				}
				return livros;
			}		

	//------------------------------------------------------------------------------------------------------------------------------------------------

	public static String[][] DevolverLivro(String[][]livros){
		Scanner sc= new Scanner(System.in);
		boolean encontrou= false;
		boolean encontrou2= false;
		int posicao=0;
		int qntEmprestimo=0;

		System.out.println("Informe o nome do livro: ");
		String busca= sc.next();
		
		System.out.println("Informe seu nome:");
		String nomeP= sc.next();
		
		for(int i=0; i<livros.length; ++i){
			if(livros[i][0] != null){
			if(livros[i][0].equalsIgnoreCase(busca)){
				encontrou= true;
				posicao=i;
			}
			}
		}
		for(int i=0; i<livros.length; ++i){
			if(livros[i][3] != null){
			if(livros[i][3].equalsIgnoreCase(nomeP)){
				encontrou2= true;
			}
			}
		}
		
		
		if(encontrou== true && encontrou2== true){
			if(livros[posicao][2] != null){
				
				if(livros[posicao][2].equalsIgnoreCase("DISPONIVEL")){
					System.out.println("Ops! Você NÃO alugou esse livro! Ele encontrasse DISPONIVEL na biblioteca.");
				}
			if(livros[posicao][2].equalsIgnoreCase("EMPRESTADO")){
		System.out.println("O livro " + livros[posicao][0] + " foi devolvido com sucesso! ");
		livros[posicao][2]= "DISPONIVEL";
		livros[posicao][3] = " ";
		
		}
			
			}
		}	
		else if(encontrou== false){
			System.out.println("Livro não cadastrado na biblioteca! ");
		}
		else if(encontrou= true && encontrou2== false){
			System.out.println("Pessoa não cadastrada! ");
		}
		
		return livros;
	}

	//--------------------------------------------------------------------------------------------------------------------------------------------------

	public static void VerTodosOsLivros(String[][]livros){

		for(int i=0; i<livros.length; ++i){
			if(livros[i][0] != null){
			System.out.println("LIVRO: " + livros[i][0]);
			System.out.println("AUTOR: " + livros[i][1]);
			System.out.println("STATUS: " + livros[i][2]);
				if(livros[i][2].equalsIgnoreCase("EMPRESTADO")){
					System.out.println("Emprestado a " + livros[i][3]);
				}
			}
		}
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------------			
	//PROCURANDO...

	public static void ProcurarTitulo(String[][]livros){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe o título do livro: ");
		String busca= sc.next();
		int posicao=0;
		boolean encontrou = false;

		for(int i=0; i< livros.length; i++){
			if(livros[i][0] != null){
			if(livros[i][0]. equalsIgnoreCase(busca)){
				encontrou = true;
				posicao=i;
			}
			}
		}
		if(encontrou == true){
			System.out.println("TITULO: " + livros[posicao][0]);
			System.out.println("AUTOR: " + livros[posicao][1]);
			System.out.println("STATUS: " + livros[posicao][2]);
			if(livros[posicao][2].equalsIgnoreCase("EMPRESTADO")){
				if(livros[posicao][3] != null){
					System.out.println("(Emprestado a " + livros[posicao][3] + ")");
				}
			}
		}
		
		if(encontrou == false) {
			System.out.println("Livro não cadastrado na biblioteca!");
		}
		
	}

	public static void ProcurarAutor(String[][]livros){
		Scanner sc= new Scanner(System.in);
		boolean encontrou= false;
		int posicao=0;
		int cont=0;
		
		System.out.println("Digite o nome do autor: ");
		String nomeAutor= sc.next();

		for(int i=0; i<livros.length; ++i){
			if(livros[i][1] != null){
			if(livros[i][1].equalsIgnoreCase(nomeAutor)){
				encontrou= true;
				posicao=i;
				System.out.println("");
				System.out.println("AUTOR: " + nomeAutor );
				System.out.println("LIVRO: " + livros[posicao][0]);
				System.out.println("STATUS: " + livros[posicao][2]);
				if(livros[i][2].equalsIgnoreCase("EMPRESTADO")){
					if(livros[i][3] != null)
					System.out.println("(Emprestado a " + livros[i][3] + ")");
				}
			}else{
				++cont;
			}
			} encontrou=false;
		}
		
		if(cont==livros.length){
			System.out.println("Não encontramos nenhum livro com esse Autor!!");
		}
	}
	
	public static void ExibirDisponiveis(String[][]livros){
		Scanner sc= new Scanner(System.in);
		boolean encontrou=false;
		int posicao=0;
		System.out.println("Livros DISPONIVEIS: ");
		System.out.println("");

		for(int i=0; i<livros.length; ++i){
			if(livros[i][2] != null){
			if(livros[i][2].equalsIgnoreCase("DISPONIVEL")){
				encontrou=true;
				posicao=i;
			}
			}
		}
		if(encontrou=true){
			for(int i=0; i<livros.length; ++i){
				if(livros[i][2] != null){
				if(livros[i][2].equalsIgnoreCase("DISPONIVEL")){
				System.out.println("-" + livros[i][0] + "\t- " + livros[i][1]);
			}
			}
		}

		}else{
		System.out.println("Não há livros DISPONIVEIS");
	}
}
//-------------------------------------------------------------------------------------------------------------------------------------------
	
	public static String[][] Cadastrar(String[][]livros){
		Scanner sc= new Scanner(System.in);
		String nome, autor, status;
		String resposta = "sim";
		int posicao = 0;	

		while (posicao < livros.length && livros[posicao][0] != null) {
			posicao++;
		}
		if(posicao == livros.length){
			System.out.println("Não há mais espaço para cadastro!");
			return livros;
		}
		
		while (resposta.equalsIgnoreCase("sim")) {
			System.out.println("Informe o nome do livro: ");
			nome= sc.next();

			for(int i=0; i<livros.length; ++i){	
				while(nome.equalsIgnoreCase(livros[i][0])){
					System.out.println("Esse livro já foi cadastrado! Informe outro título (ou cancelar): ");
					nome= sc.next();
					if (nome.equalsIgnoreCase("cancelar")) {
						return livros;
					}
				}
			}

			System.out.println("Informe o autor: ");
			autor= sc.next();

			System.out.println("Informe status: ");
			status= sc.next();

			livros[posicao][0]= nome.toUpperCase();
			livros[posicao][1]= autor.toUpperCase();
			livros[posicao][2]= status.toUpperCase();

			posicao = posicao + 1;
			
			if (posicao == livros.length) {
				System.out.println("Capacidade Maxima atingida!");
				resposta = "nao";
			} else {
				System.out.println("Deseja cadastrar mais um livro? (sim/nao) ");
				resposta= sc.next();
			}
		}
		
		int restam = livros.length - posicao;
		System.out.println("Restam " + restam + " livros a serem cadastrados.");

		return livros;
	}
		
//--------------------------------------------------------------------------------------------
	public static void ImprimirRelatorio(String[][]livros){
		int cont=0;
		int cont2=0;
		
		
		for(int i=0; i< livros.length; ++i){
			if(livros[i][2] != null){
			if(livros[i][2].equalsIgnoreCase("DISPONIVEL")){
				cont++;
				
			}
			else if(livros[i][2].equalsIgnoreCase("EMPRESTADO")){
				cont2++;
			} 
		}
		}
		int livre= livros.length - (cont + cont2);
		
		System.out.println("Livros DISPONIVEIS: " + cont + " unidades");
		System.out.println("Livros EMPRESTADOS: " + cont2 + " unidades");
		System.out.println("Quantidade de livros a serem cadastrados: " + livre);
		System.out.println("");
	
	
	}	
	
	


}//fechando classe.