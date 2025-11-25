package com.snow.pooherencia;

public class Profesor extends  Persona{
    private String asignatura;

    public Profesor(){
        System.out.println("Profesor: Inicializando constructor....");
    }

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    //encadenando los consytructores con this para reutilizar el constructor anteriror que hace mencion al de su padre
    public Profesor(String nombre, String apellido, String asignatura){
        this(nombre, apellido);
        this.asignatura= asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar(){
        return "Hello my name is: " + getNombre() +" "+ getAsignatura();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura='" + asignatura + '\'' ;
    }
}
