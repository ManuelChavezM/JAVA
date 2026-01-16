package com.snow.pooclasesabstractas.forms;

import com.snow.pooclasesabstractas.forms.elementos.*;
import com.snow.pooclasesabstractas.forms.elementos.select.Opcion;
import com.snow.pooclasesabstractas.forms.validador.*;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave","password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6,12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad","number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());


        Opcion java = new Opcion("1","Java");
        lenguaje.addopcion(java)
        .addopcion(new Opcion("2","Python"))
        .addopcion(new Opcion("3","JavaScript"))
        .addopcion(new Opcion("4","TypeScript"))
        .addopcion(new Opcion("5","PHP"));


        ElementoForm saludar = new ElementoForm() {
            @Override
            public String dibujarHtml() {
                return "<input disabled name= '"+this.nombre+"' value=\""+this.valor+"\">";
            }
        };


        saludar.setValor("Hola que tal este campo esta deshabilitado ");
        username.setValor("john.snow");
        password.setValor("abc12");
        email.setValor("john.snow@email.com");
        edad.setValor("28a");
        experiencia.setValor("... mas de 3 años de experiencia");
        java.setSelected(true);

        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        elementos.add(saludar);

        for (ElementoForm e : elementos){
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }

        elementos.forEach(e -> {
            if(!e.esValido()){
                e.getErrores().forEach(err -> System.out.println(e.getNombre()+": "+err));
            }
        });



    }
}
