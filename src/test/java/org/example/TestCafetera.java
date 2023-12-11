package org.example;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class TestCafetera {

    @Test
    public void deberiaDevolverVerdaderoSiExisteCafe(){
        Cafetera cafetera = new Cafetera(10);

        boolean resultado = cafetera.hasCafe(3);

        assertTrue(resultado);
    }

    @Test
    public void deberiaDevolverFalsoSiNoExisteCafe(){
        Cafetera cafetera = new Cafetera(10);

        boolean resultado = cafetera.hasCafe(11);

        assertFalse(resultado);
    }

    @Test
    public void deberiaRestarCafeALaCafetera(){
        Cafetera cafetera = new Cafetera(10);

        cafetera.giveCafe(7);

        assertEquals(3, cafetera.getCantidadCafe());
    }


}
