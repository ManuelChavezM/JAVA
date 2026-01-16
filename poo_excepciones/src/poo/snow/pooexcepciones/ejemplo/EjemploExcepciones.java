package poo.snow.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        String numerador = JOptionPane.showInputDialog("ingresa el numerador");
        String denominador = JOptionPane.showInputDialog("ingresa el denominador");
        int divisor ;
        double division;


        try {

           /* divisor= Integer.parseInt(valor);
            division = cal.dividir(10,divisor);
            System.out.println(division);*/

            double division2 = cal.dividir(numerador,denominador);
            System.out.println("division2 = " + division2);

        }

       /* catch (NumberFormatException nfe){
            System.out.println("se detecto una excepcion por favor ingrese un valor numerico: "+nfe.getMessage());
            main(args);
        } */    

        catch (FormatoNumeroException e) {
            System.out.println("se detecto una excepcion, ingrese un número válido: "+e.getMessage());
            e.printStackTrace(System.out);
            main(args);
        }
        catch (DivisionPorZeroException ae){
            System.out.println("Capturamos la excepcion en tiempo de ejecución: "+ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con o sin excepcion");
        }
        System.out.println("Continuamos con el flujo de la aplicación!");
    }
}
