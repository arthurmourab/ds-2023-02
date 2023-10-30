package anotacao;

@Observer(observado = "moto")
class ObservadorMoto implements Observador {

	@Override
	public void update() {
		System.out.println("Moto observada!");		
	}
}