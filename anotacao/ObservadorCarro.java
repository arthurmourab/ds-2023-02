package anotacao;

@Observer(observado = "carro")
class ObservadorCarro implements Observador {
	@Override
	public void update() {
		System.out.println("Carro observado!");
		
	}
}
