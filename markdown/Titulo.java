package markdown;

public class Titulo implements Markdown {
	private Markdown texto;
	
	public Titulo(Markdown texto) {
		this.texto = texto;	
	}

	@Override
	public String exibe() {
		String novaString = "# " + texto.exibe();
		return novaString;
	}
}
