public class Subtrai implements  Expressao {
    private Expressao valor1;
    private Expressao valor2;
    public  Subtrai(Expressao valor1, Expressao valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    @Override
    public float valor() {
        float resultado = valor1.valor() - valor2.valor();
        return resultado;
    }
}
