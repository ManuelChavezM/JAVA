package com.hayabusha.app.jardin;

import com.hayabusha.app.hogar.Persona;

public class Perro {
    protected String nombre;
    protected  String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }

}
