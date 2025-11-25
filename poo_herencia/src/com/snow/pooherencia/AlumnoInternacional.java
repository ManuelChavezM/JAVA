package com.snow.pooherencia;

public class AlumnoInternacional extends Alumno{
    private String pais;
    private double notaIdioma;


    public AlumnoInternacional(){
        System.out.println("Alumno-internacional: inicializando constructor......");
    }

    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais, double notaIdioma){
        super(nombre, apellido);
        this.pais = pais;
        this.notaIdioma= notaIdioma;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdioma() {
        return notaIdioma;
    }

    public void setNotaIdioma(double notaIdioma) {
        this.notaIdioma = notaIdioma;
    }

    @Override
    public String saludar() {
        return "Whats up bro...";
    }


    @Override
    public String toString() {
        return  super.toString() +
                "\npais='" + pais + '\'' +
                ", notaIdioma=" + notaIdioma;
    }
}
