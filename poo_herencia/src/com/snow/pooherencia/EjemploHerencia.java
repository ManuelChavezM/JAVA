package com.snow.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Mani");
        alumno.setApellido("Snow");

        Profesor profesor = new Profesor();
        profesor.setNombre("Lucy");
        profesor.setApellido("Martinez");
        profesor.setAsignatura("Biologia");

        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());

        AlumnoInternacional alumnoInter = new AlumnoInternacional();
        alumnoInter.setNombre("John");
        alumnoInter.setApellido("Spartan");
        alumnoInter.setPais("Australia");
        alumnoInter.setEdad(28);
        alumnoInter.setNotaIdioma(8.5);
        alumnoInter.setInstituto("Instituto Internacional");
        alumnoInter.setNotaBiologia(9.9);


        //Obtener la jerarquia de clases de la clase ALumno Internacional
        Class clase = alumnoInter.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }

    }
}
