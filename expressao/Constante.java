public class Constante  implements  Expressao {

    private float numero;

    public Constante(float numero) {
        this.numero = numero;
    }
    @Override
    public float valor() {
        return numero;
    }
}
