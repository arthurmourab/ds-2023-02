package markdown;

public class Negrito implements Markdown {
	private Markdown texto;
	
	public Negrito(Markdown texto) {
		this.texto = texto;	
	}

	@Override
	public String exibe() {
		String novaString = "**" + texto.exibe() + "**";
		return novaString;
	}
}
