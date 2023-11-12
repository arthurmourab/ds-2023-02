package markdown;

public class Italico implements Markdown {
	private Markdown texto;
	
	public Italico(Markdown texto) {
		this.texto = texto;	
	}

	@Override
	public String exibe() {
		String novaString = "_" + texto.exibe() + "_";
		return novaString;
	}
}
