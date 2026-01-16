package com.snow.poointerfaces.imprenta.modelo;

public interface Imprimible {
    //No debe de tener cuerpo
     String imprimir();

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
