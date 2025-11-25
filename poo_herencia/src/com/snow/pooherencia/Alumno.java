package com.snow.pooherencia;

public class Alumno extends Persona{
    private  String instituto;
    private double notaMates;
    private double notaHisctoria;
    private double notaFisica;
    private  double notaBiologia;

    public Alumno(){
        System.out.println("Alumno: Inicializando constructor de Alumno.....");
    }

    //se utiliza el constructor con parametros del padre "Persona" mediante el uso de super
    //el super tiene que ir como primera sentencia siempre
    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad, String instituto){
        super(nombre, apellido, edad);
        this.instituto= instituto;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public double getNotaMates() {
        return notaMates;
    }

    public void setNotaMates(double notaMates) {
        this.notaMates = notaMates;
    }

    public double getNotaHisctoria() {
        return notaHisctoria;
    }

    public void setNotaHisctoria(double notaHisctoria) {
        this.notaHisctoria = notaHisctoria;
    }

    public double getNotaFisica() {
        return notaFisica;
    }

    public void setNotaFisica(double notaFisica) {
        this.notaFisica = notaFisica;
    }

    public double getNotaBiologia() {
        return notaBiologia;
    }

    public void setNotaBiologia(double notaBiologia) {
        this.notaBiologia = notaBiologia;
    }

    @Override
    public String saludar(){
            return "Hola que tal mi nombre es: " + getNombre();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ninstituto='" + instituto + '\'' +
                ", notaMates=" + notaMates +
                ", notaHisctoria=" + notaHisctoria +
                ", notaFisica=" + notaFisica +
                ", notaBiologia=" + notaBiologia ;
    }
}
