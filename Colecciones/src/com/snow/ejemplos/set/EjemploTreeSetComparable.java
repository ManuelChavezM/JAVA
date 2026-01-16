package com.snow.ejemplos.set;

import com.snow.ejemplos.modelo.Alumno;

import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        TreeSet<Alumno> sa = new TreeSet<>();
        sa.add(new Alumno("Lucy",10));
        sa.add(new Alumno("Haru",2));
        sa.add(new Alumno("Grove",9));
        sa.add(new Alumno("Lux",7));
        sa.add(new Alumno("Morgana",11));

        System.out.println("sa = " + sa);
    }
}
