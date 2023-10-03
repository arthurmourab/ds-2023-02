import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RaizQuadradaNewtonTeste {

    @Test
    void testeRaiz() {
        assertEquals(2.0, RaizQuadradaNewton.raiz(4.0), 1e-5);
        assertEquals(3.0, RaizQuadradaNewton.raiz(9.0), 1e-5);
        assertEquals(4.0, RaizQuadradaNewton.raiz(16.0), 1e-5);
        assertEquals(5.0, RaizQuadradaNewton.raiz(25.0), 1e-5);
    }

    @Test
    void testeRaizComInputNegativo() {
        assertThrows(IllegalArgumentException.class, () -> RaizQuadradaNewton.raiz(-1.0));
    }

    @Test
    void testeRaizNaoConvergente() {
        assertThrows(RuntimeException.class, () -> RaizQuadradaNewton.raiz(1.0e73));
    }
}
