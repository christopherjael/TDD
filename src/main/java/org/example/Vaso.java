package org.example;

public class Vaso {
    private int candatidadVasos;
    private int contenido;

    public Vaso(int candatidadVasos, int contenido) {
        this.candatidadVasos = candatidadVasos;
        this.contenido = contenido;
    }

    public int getCandatidadVasos() {
        return candatidadVasos;
    }

    public void setCandatidadVasos(int candatidadVasos) {
        this.candatidadVasos = candatidadVasos;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public boolean hasVasos(int candatidadVasos){
        return candatidadVasos <= this.candatidadVasos;
    }

    public void giveVasos(int candatidadVasos){
        this.candatidadVasos = this.candatidadVasos - candatidadVasos;
    }
}
