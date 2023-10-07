import java.util.function.Function;

public class RaizQuadradaNewton implements Function<Double, Double> {
    @Override
    public Double apply(Double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo");
        }

        // Chute inicial para a raiz quadrada
        double chuteInicial = x / 2.0;

        // Número máximo de iterações para evitar loops infinitos
        int maxIteracoes = 50;

        // Critério de parada
        double epsilon = 1e-10;

        // Iterações do Método de Newton
        for (int i = 0; i < maxIteracoes; i++) {
            double novoChute = 0.5 * (chuteInicial + x / chuteInicial);
            if (Math.abs(novoChute - chuteInicial) < epsilon) {
                // Convergiu o suficiente
                return novoChute;
            }
            chuteInicial = novoChute;
        }

        // Se atingir o número máximo de iterações e não convergir, lançar exceção
        throw new RuntimeException("O método de Newton não convergiu para a raiz quadrada de " + x);
    }
}
