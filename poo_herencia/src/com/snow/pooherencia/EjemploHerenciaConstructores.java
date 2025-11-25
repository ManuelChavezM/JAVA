package com.snow.pooherencia;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo los datos del Persona: ");
        System.out.println(persona.getNombre() + " " + persona.getApellido() + " " + persona.getEdad() );

        if(persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del ALumno: ");
            System.out.println(((Alumno) persona).getInstituto());
            System.out.println(((Alumno) persona).getNotaBiologia());

            if(persona instanceof  AlumnoInternacional){
                System.out.println("Imprimiendo los datos del ALumno Internacional: ");
                System.out.println(((AlumnoInternacional) persona).getPais());
                System.out.println(((AlumnoInternacional) persona).getNotaIdioma());
            }
        }
        if(persona instanceof  Profesor){
            System.out.println("Imprimiendo los datos del Profesor: ");
            System.out.println(((Profesor) persona).getAsignatura());
        }
        System.out.println(" =============================Sobre escritura de metodo ============================ " );
        System.out.println(persona.saludar());

    }

}
