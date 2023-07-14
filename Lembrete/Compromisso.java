package Lembrete;

public class Compromisso {
	
	String data;
	double hora;
	String descricao;
	
	Compromisso (String data, double hora, String descricao ){
		this.data = data;
		this.hora = hora;
		this.descricao = descricao;
	}

	public Compromisso(String data, String hora, String descricao) {
		
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

	public String getDescricao() {
		return descricao.toString();
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
		
}
