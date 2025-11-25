package com.snow.poosobrecarga;
import static com.snow.poosobrecarga.Calculadora.*;


public class EjemploSobrecarga {
    public static void main(String[] args) {

        //Calculadora cal = new Calculadora();

        System.out.println("Sumar int: "+ suma(10,5) );
        System.out.println("Sumar float: "+ suma(10.0f, 5.0f));
        System.out.println("Sumar int-float: " + suma(10f,5));

        System.out.println("Sumar n numeros enteros: " + suma(1+2+3+4+5));
    }
}
