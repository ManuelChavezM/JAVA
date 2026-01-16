package com.snow.pooclasesabstractas.forms.elementos;

import com.snow.pooclasesabstractas.forms.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    //Constructor
    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this(); //constructor vacio de la misma clase
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ElementoForm addValidador(Validador vali){
        this.validadores.add(vali);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido(){
        for (Validador v: validadores){
            if(!v.esValido(this.valor)){
                this.errores.add(v.getMensaje());
            }
        }
        return  this.errores.isEmpty();
    }

    abstract public String dibujarHtml();

}
