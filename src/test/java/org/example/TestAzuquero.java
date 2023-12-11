package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAzuquero {

    Azucarero azucarero;

    @BeforeEach
    public void setUp(){
        this.azucarero = new Azucarero(10);
    }

    @Test
    public void deberiaDevolverVerdaderoSiHaySuficienteAzucarEnElAzucarero(){
        boolean resultado = azucarero.hasAzucar(5);

        assertTrue(resultado);

        resultado = azucarero.hasAzucar(10);

        assertTrue(resultado);
    }

    @Test
    public void deberiaDevolverFalsoPorqueNoHaySuficienteAzucarEnElAzuquero(){
        boolean resultado = azucarero.hasAzucar(15);
        assertFalse(resultado);
    }

    @Test
    public void deberiaRestarAzucarAlAzuacare(){
        azucarero.giveAzucar(5);

        assertEquals(5,azucarero.getCantidadDeAzucar());

        azucarero.giveAzucar(2);

        assertEquals(3, azucarero.getCantidadDeAzucar());
    }

}
