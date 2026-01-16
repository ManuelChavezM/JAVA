package com.snow.ejemplos.modelo;

public class Alumno implements  Comparable<Alumno>{
    private String nombre;
    private int Rank;

    public Alumno() {
    }

    public Alumno(String nombre, int rank) {
        this.nombre = nombre;
        Rank = rank;
    }

    public int getRank() {
        return Rank;
    }

    public void setRank(int rank) {
        Rank = rank;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "nombre= " + nombre + '\'' + ", Rank= " + Rank ;
    }

    @Override
    public int compareTo(Alumno o) {
        if(this.nombre == null){
            return 0;
        }
        return this.nombre.compareTo(o.nombre);
    }
}
