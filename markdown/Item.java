package markdown;

public class Item implements Markdown {
	private Markdown texto;
	
	public Item(Markdown texto) {
		this.texto = texto;	
	}

	@Override
	public String exibe() {
		String novaString = "- " + texto.exibe();
		return novaString;
	}
}
