package org.example;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestVaso {

    @Test
    public void deberiaDevolverVerdaderoExistenVasos(){
        Vaso vasosPequeno = new Vaso(2,10);

        boolean resultado = vasosPequeno.hasVasos(1);

        assertTrue(resultado);
    }

    @Test
    public void deberiaDevolverFalsosSiNoExistenVasos(){
        Vaso vasosPequeno = new Vaso(1,10);

        boolean resultado = vasosPequeno.hasVasos(2);

        assertFalse(resultado);
    }

    @Test
    public void deberiaRestarCantidadDeVasos(){
        Vaso vasosPequeno = new Vaso(5,10);

        vasosPequeno.giveVasos(1);

        assertEquals(4, vasosPequeno.getCandatidadVasos());
    }


}
