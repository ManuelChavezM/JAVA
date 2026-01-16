package com.snow.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        String[] peces = {"Corbina", "Lenguado", "Robalo", "Atun", "Salmon" , "Lenguado", "Corbina"};
        Set<String> unicos = new HashSet<>();
        for (String pez: peces){
            if (!unicos.add(pez)){
                System.out.println("pez duplicado = " + pez);
            }
        }

        System.out.println("peces en la red unicos: " + unicos.size()+" = " + unicos);
    }
}
