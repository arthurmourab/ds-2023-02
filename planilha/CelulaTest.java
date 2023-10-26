package planilha;

import static org.junit.Assert.*;
import org.junit.*;

public class CelulaTest {

    @Test
    public void testSetStatus() {
        Celula celula = new Celula("A1");
        celula.setStatus("Ativo");
        assertEquals("Ativo", celula.getStatus());
    }

    @Test
    public void testUpdate() {
        Celula celula1 = new Celula("A1");
        Celula celula2 = new Celula("A2");
        
        celula1.addObserver(celula2);
        celula1.setStatus("Ativo");
        
        assertEquals("Ativo", celula2.getStatus());
        }
}
