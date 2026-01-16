package com.snow.poointerfaces.imprenta;

import com.snow.poointerfaces.imprenta.modelo.*;
import static com.snow.poointerfaces.imprenta.modelo.Genero.*;
import static com.snow.poointerfaces.imprenta.modelo.Imprimible.imprimir;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Persona("John","Doe"),"Ingeniero en sistemas","Resumen laboral...");
        cv.addExperiencias("Java")
                .addExperiencias("Oracle DBA")
                .addExperiencias("Spring Framework")
                .addExperiencias("Desarrollador Fullstack")
                .addExperiencias("Angular");

        Libro lb = new Libro(new Persona("Juanito","Juan"),"La llegada de la Esfera",CIENCIA_FICCION);
        lb.addPagina(new Pagina("Esfere de Buga"))
                .addPagina(new Pagina("Maussan"))
                .addPagina(new Pagina("31 I Atlas"))
                .addPagina(new Pagina("Primer Contacto"));


        Informe informe = new Informe(new Persona("Martin","Fowler"),new Persona("James","MacDowell"),"Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(lb);

    }


}
