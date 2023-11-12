package markdown;

public class Main {
	public static void main(String[] args) {
		
		Texto texto1 = new Texto("Título");
		
		Titulo titulo = new Titulo(texto1);
		
		Texto texto2 = new Texto("Uma simples linha, com ");
		Texto texto3 = new Texto("negrito");
		Texto texto4 = new Texto(" e ");
		Texto texto5 = new Texto("itálico");
		
		Negrito negrito = new Negrito(texto3);
		Italico italico = new Italico(texto5);
		Concatena frase = new Concatena(texto2, new Concatena(negrito, new Concatena(texto4, italico)));
		
		
		Texto texto6 = new Texto("Primeiro item com ");
		Texto texto7 = new Texto("itálico");
		
		Item item = new Item(texto6);
		Italico italico2 = new Italico(texto7);
		Concatena frase2 = new Concatena(item, italico2);
		
		
		System.out.println(titulo.exibe());
		System.out.println(frase.exibe());
		System.out.println(frase2.exibe());		
	
	}
}
