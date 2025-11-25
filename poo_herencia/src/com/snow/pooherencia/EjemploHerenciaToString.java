package com.snow.pooherencia;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Mani","Snow");

        Profesor profesor = new Profesor("Lucy","Martinez","Biologia");

        AlumnoInternacional alumnoInter = new AlumnoInternacional("John","Spartan","Australia",8.9);


        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());
        System.out.println(" ========================================================= " );
        imprimir(alumno);
        System.out.println(" ========================================================= " );
        imprimir(profesor);
        System.out.println(" ========================================================= " );
        imprimir(alumnoInter);

    }

    public static void imprimir (Persona persona){
        //para mandar a llamar al metodo to string de la clase
        System.out.println(persona);
    }

}
