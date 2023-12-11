package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);

            Cafetera cafetera;
            Vaso vasoPequeno;
            Vaso vasoMediano;
            Vaso vasoGrande;
            Azucarero azucarero;
            MaquinaCafe maquinaCafe;
            cafetera = new Cafetera(60);
            vasoPequeno = new Vaso(10, 10);
            vasoMediano = new Vaso(10,20);
            vasoGrande = new Vaso(10,30);
            azucarero = new Azucarero(30);
            maquinaCafe = new MaquinaCafe();
            maquinaCafe.setCafe(cafetera);
            maquinaCafe.setVasosPequenos(vasoPequeno);
            maquinaCafe.setVasosMedianos(vasoMediano);
            maquinaCafe.setVasosGrandes(vasoGrande);
            maquinaCafe.setAzucar(azucarero);

            System.out.println("*** Bienvenido/a ***");
            while (true){
                System.out.println("1. Petir un cafe ☕");
                System.out.println("2. Ver estado de la maquina 🏧");
                System.out.println("3. Salir 🚪");
                System.out.println("Inserte la opcion: ");
                int opc = in.nextInt();
                if(opc == 1){
                    System.out.println("Escoge el tipo de vaso");
                    System.out.println("1. Vaso pequeno - 3oz | cant: "+maquinaCafe.getVasosPequenos().getCandatidadVasos());
                    System.out.println("2. Vaso mediano - 5oz | cant: "+maquinaCafe.getVasosMedianos().getCandatidadVasos());
                    System.out.println("3. Vaso grande - 7oz | cant: "+maquinaCafe.getVasosGrandes().getCandatidadVasos());
                    System.out.println("Inserte la opcion: ");
                    int tipoVaso = in.nextInt();
                    Vaso vaso = new Vaso(0,0);
                    switch (tipoVaso){
                        case 1: vaso = maquinaCafe.getTipoVaso("pequeno");break;
                        case 2: vaso = maquinaCafe.getTipoVaso("mediano");break;
                        case 3: vaso = maquinaCafe.getTipoVaso("grande");break;
                        default:
                            System.out.println("Opcion no disponible"); continue;
                    }
                    System.out.println("\nEscoge la cantidad de vasos: ");
                    int cantidadVasos = in.nextInt();

                    System.out.println("\nEscoge la cantidad de azucar: ");
                    int cantidadAzucar = in.nextInt();

                    System.out.println("\n"+maquinaCafe.getVasoDeCafe(vaso,cantidadVasos,cantidadAzucar)+"\n");

                }else if (opc == 2){
                    System.out.println("*** Estado de la maquina 🏧 ***");
                    System.out.println("Vaso pequeno - 3oz | cant: "+maquinaCafe.getVasosPequenos().getCandatidadVasos());
                    System.out.println("Vaso mediano - 5oz | cant: "+maquinaCafe.getVasosMedianos().getCandatidadVasos());
                    System.out.println("Vaso grande - 7oz | cant: "+maquinaCafe.getVasosGrandes().getCandatidadVasos());
                    System.out.println("Cantidad de azucar: "+maquinaCafe.getAzucar().getCantidadDeAzucar());
                    System.out.printf("Cantidad de cafe: "+maquinaCafe.getCafe().getCantidadCafe()+" ☕\n");
                    System.out.println("***************\n\n");
                }else {
                    System.out.println("Nos veremos pronto...");
                    break;
                }
            }

        }catch (Exception e){
            System.err.println(e.getMessage());
        }

    }

}