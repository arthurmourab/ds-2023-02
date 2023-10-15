package builder;

public class Endereco {
	private String rua;
	private String setor;
	private String cep;
	private String numero;
	private String cidade;
	private String estado;
	private String bloco;
	private String quadra;

	// Construtor privado
	private Endereco(Builder builder) {
		this.rua = builder.rua;
		this.setor = builder.setor;
		this.cep = builder.cep;
		this.numero = builder.numero;
		this.cidade = builder.cidade;
		this.estado = builder.estado;
		this.bloco = builder.bloco;
		this.quadra = builder.quadra;
	}

	public String getRua() {
		return rua;
	}

	public String getSetor() {
		return setor;
	}

	public String getCep() {
		return cep;
	}

	public String getNumero() {
		return numero;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getBloco() {
		return bloco;
	}

	public String getQuadra() {
		return quadra;
	}

	public static class Builder {
		private String rua;
		private String setor;
		private String cep;
		private String numero;
		private String cidade;
		private String estado;
		private String bloco;
		private String quadra;

		// Campos obrigatórios do construtor
		public Builder(String rua, String cidade, String estado) {
			this.rua = rua;
			this.cidade = cidade;
			this.estado = estado;
		}

		// Campos opcionais
		public Builder setSetor(String setor) {
			this.setor = setor;
			return this;
		}

		public Builder setCep(String cep) {
			this.cep = cep;
			return this;
		}

		public Builder setNumero(String numero) {
			this.numero = numero;
			return this;
		}

		public Builder setBloco(String bloco) {
			this.bloco = bloco;
			return this;
		}

		public Builder setQuadra(String quadra) {
			this.quadra = quadra;
			return this;
		}

		// Construir a instância de Endereco
		public Endereco build() {
			return new Endereco(this);
		}
	}
}
