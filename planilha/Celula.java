package planilha;

import java.util.ArrayList;
import java.util.List;

public class Celula implements CelulaObserver {
	private String nome;
	private String status;
	private List<CelulaObserver> observers = new ArrayList<>();
	
	public Celula(String nome) {
		this.nome = nome;
		this.status = "inativo";		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void addObserver(CelulaObserver observer) {
		this.observers.add(observer);
	}
	
	public void removeObserver(CelulaObserver observer) {
		this.observers.remove(observer);
	}
	
	public void setStatus(String status) {
		this.status = status;
		for (CelulaObserver observer: observers) {
			observer.update(this.nome, this.status);
		}
	}
	
	@Override
	public void update(String nome, String status) {
		System.out.println("Reavaliar "+ this.getNome() +" por mudança ocorrida em " + nome);
		this.setStatus((String) status);
	}	

}
