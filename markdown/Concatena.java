package markdown;

public class Concatena implements Markdown {
	private Markdown markdown;
	private Markdown markdown2;
	
	public Concatena (Markdown markdown, Markdown markdown2) {
		this.markdown = markdown;
		this.markdown2 = markdown2;
		
	}

	@Override
	public String exibe() {
		String novaString = markdown.exibe() + markdown2.exibe();
		return novaString;
	}

}
