package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMaquinaDeCafe {

    Cafetera cafetera;
    Vaso vasoPequeno;
    Vaso vasoMediano;
    Vaso vasoGrande;
    Azucarero azucarero;
    MaquinaCafe maquinaCafe;

    @BeforeEach
    public void setUp(){
        this.cafetera = new Cafetera(50);
        this.vasoPequeno = new Vaso(5, 10);
        this.vasoMediano = new Vaso(5,20);
        this.vasoGrande = new Vaso(5,30);
        this.azucarero = new Azucarero(20);

        this.maquinaCafe = new MaquinaCafe();
        this.maquinaCafe.setCafe(cafetera);
        this.maquinaCafe.setVasosPequenos(vasoPequeno);
        this.maquinaCafe.setVasosMedianos(vasoMediano);
        this.maquinaCafe.setVasosGrandes(vasoGrande);
        this.maquinaCafe.setAzucar(azucarero);
    }

    @Test
    public void deberiaDevolverUnVasoPequeno(){
        Vaso vaso = maquinaCafe.getTipoVaso("pequeno");
        assertEquals(maquinaCafe.getVasosPequenos(), vaso);
    }

    @Test
    public void deberiaDevolverUnVasoMediano(){
        Vaso vaso = maquinaCafe.getTipoVaso("mediano");
        assertEquals(maquinaCafe.getVasosMedianos(), vaso);
    }

    @Test
    public void deberiaDevolverUnVasoGrande(){
        Vaso vaso = maquinaCafe.getTipoVaso("grande");
        assertEquals(maquinaCafe.getVasosGrandes(), vaso);
    }

    @Test
    public void deberiaDevolverNoHayVasos(){
        Vaso vaso = maquinaCafe.getTipoVaso("pequeno");
        String resultado = maquinaCafe.getVasoDeCafe(vaso,10,2);
        assertEquals("No hay Vasos", resultado);
    }

    @Test
    public void deberiaDevolverNoHayCafe(){
        cafetera = new Cafetera(5);
        maquinaCafe.setCafe(cafetera);
        Vaso vaso = maquinaCafe.getTipoVaso("pequeno");
        String resultado = maquinaCafe.getVasoDeCafe(vaso,2,2); // en el PDF la cantidad de vasos era 1 lo que nunca hiba a provocar el mensaje esperado porque hay 5 de cafe y el cafe peque;o toma 3 oz
        assertEquals("No hay Cafe", resultado);
    }

    @Test
    public void deberiaDevolverNoHayAzucar(){
        azucarero = new Azucarero(2);
        maquinaCafe.setAzucar(azucarero);
        Vaso vaso = maquinaCafe.getTipoVaso("pequeno");
        String resultado = maquinaCafe.getVasoDeCafe(vaso,1,3);
        assertEquals("No hay Azucar", resultado);
    }

    @Test
    public void deberiaRestarCafe(){
        Vaso vaso = maquinaCafe.getTipoVaso("pequeno");
        maquinaCafe.getVasoDeCafe(vaso,1,3);
        int result = maquinaCafe.getCafe().getCantidadCafe();
        assertEquals(47,result);
    }

    @Test
    public void deberiaRestarVaso(){
        Vaso vaso = maquinaCafe.getTipoVaso("pequeno");
        maquinaCafe.getVasoDeCafe(vaso,1,3);
        int result = maquinaCafe.getVasosPequenos().getCandatidadVasos();
        assertEquals(4,result);
    }

    @Test
    public void deberiaRestarAzucar(){
        Vaso vaso = maquinaCafe.getTipoVaso("pequeno");
        maquinaCafe.getVasoDeCafe(vaso,1,3);
        int result = maquinaCafe.getAzucar().getCantidadDeAzucar();
        assertEquals(17,result);
    }

    @Test
    public void deberiaDevolverFelicitaciones(){
        Vaso vaso = maquinaCafe.getTipoVaso("pequeno");
        String result = maquinaCafe.getVasoDeCafe(vaso,1,3);
        assertEquals("Felicitaciones",result);
    }
}
