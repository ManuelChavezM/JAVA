package com.snow.pooclasesabstractas.forms.validador;

public class LargoValidador extends Validador{

    protected String mensaje = "el campo debe tener un minimo %d caracteres y un maximo %d caracteres";

    private  int minimo;
    private  int maximo = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int minimo, int maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }


    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        this.mensaje=String.format(this.mensaje,this.minimo,this.maximo);
        if (valor == null){
            return true;
        }

        int largo = valor.length();
        return (largo >= minimo && largo <= maximo);
    }
}
