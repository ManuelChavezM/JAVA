package com.snow.ejemplos.set;

import com.snow.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Lucy",10));
        sa.add(new Alumno("Haru",2));
        sa.add(new Alumno("Grove",9));
        sa.add(new Alumno("Lux",7));
        sa.add(new Alumno("Morgana",11));

        //ordenar
        Collections.sort(sa);
        System.out.println("sa = " + sa);

        //Collections.sort(sa,(a,b)->b.compareTo(a));
        //sa.sort((a,b)-> b.compareTo(a));
        //por nota ordenar
        sa.sort(Comparator.comparing((Alumno a)->a.getRank()));
        System.out.println("sa = " + sa);
        //por nombre ordenar
        sa.sort(Comparator.comparing((Alumno a)->a.getNombre()));
        System.out.println("sa = " + sa);
        //descendente
        sa.sort(Comparator.comparing((Alumno a)->a.getNombre()).reversed());
        System.out.println("sa = " + sa);

        //y esto es lo mismo que lo anterior solo que simplificado
        sa.sort(Comparator.comparing(Alumno::getNombre).reversed());
        System.out.println("sa = " + sa);

        System.out.println();
        System.out.println("Iterando usnado Stream ForEach");
        sa.forEach(System.out::println);
    }
}
