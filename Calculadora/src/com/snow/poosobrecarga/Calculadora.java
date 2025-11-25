package com.snow.poosobrecarga;

public class Calculadora {

    private Calculadora() {
    }

    //metodo sobrecarga con n cantidad de argumentos

    public static int suma(int... numeros){
        int total = 0;
        for (int i: numeros) {
            total+=i;
        }
        return  total;
    }
    // fin de n variables
    public static int suma(int a, int b){
        return a+b;
    }

    public static float suma (float x, float y){
        return x+y;
    }

    public static  float suma(int j, float k){
        return j+k;
    }

    public static float suma(float k, int j){
        return j+k;
    }

    public static double suma (double s, double d){
        return  s+d;
    }

    public static int suma (String c, String v){
        int resultado;
        try {
            resultado= Integer.parseInt(c) + Integer.parseInt(v);
        } catch (NumberFormatException e) {
            resultado=0;
        }

        return resultado;
    }

    public static int suma (int a, int b, int c){
        return a+b+c;
    }

}
