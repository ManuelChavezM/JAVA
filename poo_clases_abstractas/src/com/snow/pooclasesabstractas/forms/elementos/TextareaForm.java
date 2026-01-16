package com.snow.pooclasesabstractas.forms.elementos;

public class TextareaForm extends ElementoForm {

    private int fila;
    private int columnas;

    public TextareaForm(String nombre) {
        super(nombre);
    }

    public TextareaForm(String nombre, int fila, int columnas) {
        super(nombre);
        this.fila = fila;
        this.columnas = columnas;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    @Override
    public String dibujarHtml() {
        return "<textarea name='"+this.nombre+"' cols='"+this.columnas+"' rows='"+this.fila+"'>"+ this.valor +"</textarea>";
    }
}
