package Lembrete;

import java.util.ArrayList;

public class Agenda {

	ArrayList<Compromisso> compromissos = new ArrayList<Compromisso>();
	
	void addCompromisso(Compromisso compromisso) {
		compromissos.add(compromisso);
		compromisso.descricao = this.toString();
	}
	
	public void removerCompromisso(int indice) {
		if(indice >= 0 && indice < compromissos.size()); {
			compromissos.remove(indice);
			System.out.println("Compromisso removido com sucesso!");
		} 
			
			
	}
	
	public void listarCompromisso() {
		if(compromissos.isEmpty()) {
			System.out.println("Nenhum compromisso cadastrado.");
		} else {
			System.out.println("Lista de Comprimissos.");
			for(Compromisso compromisso : compromissos) {
				System.out.println("Data: " + compromisso.getData());
				System.out.println("Hora: " + compromisso.getHora());
				System.out.println("Descrição " + compromisso.getDescricao().toString());
				System.out.println("-------------------------------");
			}
		}
	}
	
	
		
}
	

