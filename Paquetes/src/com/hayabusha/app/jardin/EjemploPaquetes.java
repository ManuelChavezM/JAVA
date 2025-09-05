package com.hayabusha.app.jardin;

import com.hayabusha.app.hogar.*;

//import static com.hayabusha.app.hogar.Persona.GENERO_MASCULINO;
//import static  com.hayabusha.app.hogar.Persona.saludar;
import static  com.hayabusha.app.hogar.Persona.*;
import static com.hayabusha.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {


        Persona p = new Persona();
        p.setNombre("Mani");
        p.setApeido("Snow");
        p.setColorPelo(CAFE);
        System.out.println("p = " + p.getNombre()+" "+p.getApeido()+" , "+ GENERO_MASCULINO+" , "+ p.getColorPelo());


        Gato g = new Gato();
        Perro perrito = new Perro();


        String interaccion = perrito.jugar(p);
        System.out.println("interaccion = " + interaccion);

        String saludoPersonaJardin = saludar();
        System.out.println(saludoPersonaJardin);


    }
}
