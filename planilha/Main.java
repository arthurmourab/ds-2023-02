package planilha;

public class Main {
	public static void main (String[] args) {
		Celula celula1 = new Celula("A1");
		Celula celula2 = new Celula("A2");
		Celula celula3 = new Celula("A3");
		
		celula1.addObserver(celula2);
		celula2.addObserver(celula3);
		

		celula1.setStatus("Ativo");	
	}
}
