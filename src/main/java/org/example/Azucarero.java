package org.example;

public class Azucarero {
    private int cantidadDeAzucar;

    public Azucarero(int cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }

    public int getCantidadDeAzucar() {
        return cantidadDeAzucar;
    }

    public void setCantidadDeAzucar(int cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }

    public boolean hasAzucar(int cantidadDeAzucar){
        return cantidadDeAzucar <= this.cantidadDeAzucar;
    }

    public void giveAzucar(int cantidadDeAzucar){
        this.cantidadDeAzucar = this.cantidadDeAzucar - cantidadDeAzucar;
    }

}
