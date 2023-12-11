package org.example;

public class MaquinaCafe {
    private Cafetera cafe;
    private Vaso vasosPequenos;
    private Vaso vasosMedianos;
    private Vaso vasosGrandes;
    private Azucarero azucar;

    public Cafetera getCafe() {
        return cafe;
    }

    public void setCafe(Cafetera cafe) {
        this.cafe = cafe;
    }

    public Vaso getVasosPequenos() {
        return vasosPequenos;
    }

    public void setVasosPequenos(Vaso vasosPequenos) {
        this.vasosPequenos = vasosPequenos;
    }

    public Vaso getVasosMedianos() {
        return vasosMedianos;
    }

    public void setVasosMedianos(Vaso vasosMedianos) {
        this.vasosMedianos = vasosMedianos;
    }

    public Vaso getVasosGrandes() {
        return vasosGrandes;
    }

    public void setVasosGrandes(Vaso vasosGrandes) {
        this.vasosGrandes = vasosGrandes;
    }

    public Azucarero getAzucar() {
        return azucar;
    }

    public void setAzucar(Azucarero azucar) {
        this.azucar = azucar;
    }

    public Vaso getTipoVaso(String tipoDeVaso){
        if (tipoDeVaso.trim().equals("pequeno")){
            return this.vasosPequenos;
        }else if (tipoDeVaso.trim().equals("mediano")){
            return this.vasosMedianos;
        }else {
            return this.vasosGrandes;
        }
    }

    public String getVasoDeCafe(Vaso tipoDeVaso, int cantidadDeVasos, int cantidadDeAzucar){
        if (tipoDeVaso.equals(this.vasosPequenos)){
            if(!this.azucar.hasAzucar(cantidadDeAzucar)){
                return "No hay Azucar";
            }
            if(!this.vasosPequenos.hasVasos(cantidadDeVasos)){
                return "No hay Vasos";
            }
            if(!this.cafe.hasCafe(3*cantidadDeVasos)){
                return "No hay Cafe";
            }

            cafe.giveCafe(3*cantidadDeVasos);
            vasosPequenos.giveVasos(cantidadDeVasos);
            azucar.giveAzucar(cantidadDeAzucar*cantidadDeVasos);
            return "Felicitaciones";
        }else if (tipoDeVaso.equals(this.vasosMedianos)){
            if(!this.azucar.hasAzucar(cantidadDeAzucar)){
                return "No hay Azucar";
            }
            if(!this.vasosMedianos.hasVasos(cantidadDeVasos)){
                return "No hay Vasos";
            }
            if(!this.cafe.hasCafe(5*cantidadDeVasos)){
                return "No hay Cafe";
            }

            cafe.giveCafe(5*cantidadDeVasos);
            vasosMedianos.giveVasos(cantidadDeVasos);
            azucar.giveAzucar(cantidadDeAzucar*cantidadDeVasos);
            return "Felicitaciones";
        }else if (tipoDeVaso.equals(this.vasosGrandes)){
            if(!this.azucar.hasAzucar(cantidadDeAzucar)){
                return "No hay Azucar";
            }
            if(!this.vasosGrandes.hasVasos(cantidadDeVasos)){
                return "No hay Vasos";
            }
            if(!this.cafe.hasCafe(7*cantidadDeVasos)){
                return "No hay Cafe";
            }
            cafe.giveCafe(7*cantidadDeVasos);
            vasosGrandes.giveVasos(cantidadDeVasos);
            azucar.giveAzucar(cantidadDeAzucar*cantidadDeVasos);
            return "Felicitaciones";
        }

        return "";
    };
}
