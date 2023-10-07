import org.junit.Test;
import static org.junit.Assert.*;
import java.util.function.Function;

public class RaizQuadradaNewtonTeste {

    @Test
    public void testeRaiz() {
        RaizQuadradaNewton raizQuadrada = new RaizQuadradaNewton();
        Function<Double, Double> minhaRaiz = raizQuadrada::apply;

        double resultado1 = minhaRaiz.apply(25.0);
        double resultado2 = minhaRaiz.apply(169.0);
        double resultado3 = minhaRaiz.apply(10000.0);

        assertEquals(5.0, resultado1, 1e-5);
        assertEquals(13.0, resultado2, 1e-5);
        assertEquals(100.0, resultado3, 1e-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeRaizComInputNegativo() {
        RaizQuadradaNewton raizQuadrada = new RaizQuadradaNewton();
        Function<Double, Double> minhaRaiz = raizQuadrada::apply;
        minhaRaiz.apply(-25.0);
    }

    @Test(expected = RuntimeException.class)
    public void testeRaizNaoConvergente() {
        RaizQuadradaNewton raizQuadrada = new RaizQuadradaNewton();
        Function<Double, Double> minhaRaiz = raizQuadrada::apply;
        minhaRaiz.apply(1.0e73);
    }
}
