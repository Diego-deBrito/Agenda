package Lembrete;

import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int opcao = 0;
		
		while(opcao != 4) {
			System.out.println("Escolha uma opção: ");
			System.out.println("1. Adicionar compromisso.");
			System.out.println("2. Remover compromisso.");
			System.out.println("3. Listar compromisso.");
			System.out.println("4. Sair.");
			
			System.out.println("Opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer do scanner.
			
			switch(opcao) {
				case 1:
					System.out.println("Digite a data do compromisso:");
					String data = scanner.nextLine();
					System.out.println("Digite a hora do compromisso:");
					String hora = scanner.nextLine();
					System.out.println("Digite a descrição do compromisso: ");
					String descricao = scanner.nextLine();
					
					Compromisso compromisso = new Compromisso(data, hora, descricao);
					agenda.addCompromisso(compromisso);
					System.out.println("Compromisso adicionado com sucesso! ");
					break;
				case 2:
					System.out.println("Digite o índice do compromisso a ser removido: ");
					int indice = scanner.nextInt();
					scanner.nextInt(); // limpar buffer
					
					agenda.removerCompromisso(indice);
					break;
				case 3:
					agenda.listarCompromisso();
					break;
				case 4:
					System.out.println("Encerrando o programa...");
					break;
				
			}
			
		}
		
	}

}
