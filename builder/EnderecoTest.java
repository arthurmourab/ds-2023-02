package builder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EnderecoTest {

	@Test
	public void testConstrucaoEndereco() {
		Endereco endereco = new Endereco.Builder("Rua 123", "Goiânia", "Goiás").setSetor("Marista")
				.setCep("12345-678").setNumero("123").setBloco("Bloco A").setQuadra("Quadra B").build();

		assertEquals("Rua 123", endereco.getRua());
		assertEquals("Marista", endereco.getSetor());
		assertEquals("12345-678", endereco.getCep());
		assertEquals("123", endereco.getNumero());
		assertEquals("Goiânia", endereco.getCidade());
		assertEquals("Goiás", endereco.getEstado());
		assertEquals("Bloco A", endereco.getBloco());
		assertEquals("Quadra B", endereco.getQuadra());
	}

	@Test
	public void testConstrucaoEnderecoSemCamposOpcionais() {
		Endereco endereco = new Endereco.Builder("Rua B", "Cidade Y", "Estado Z").build();

		assertEquals("Rua B", endereco.getRua());
		assertEquals(null, endereco.getSetor());
		assertEquals(null, endereco.getCep());
		assertEquals(null, endereco.getNumero());
		assertEquals("Cidade Y", endereco.getCidade());
		assertEquals("Estado Z", endereco.getEstado());
		assertEquals(null, endereco.getBloco());
		assertEquals(null, endereco.getQuadra());
	}
}
