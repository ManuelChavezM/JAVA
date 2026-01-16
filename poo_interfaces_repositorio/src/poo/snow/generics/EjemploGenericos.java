package poo.snow.generics;

import poo.snow.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Haya","Snow"));

        Cliente primero = clientes.iterator().next();

        Cliente[] visitantes = {};

        List<String> nombre = fromArrayToList(new String[]{"Dom","Hanna","Sputnik","Goku"}, new String[]{"Bea","Lucy","David "});
        System.out.println();
        nombre.forEach(System.out::println);

        System.out.println("El mmaximo entre 1, 9 y 4 es: "+ maximo(1,9, 4));
        System.out.println("El mmaximo es: "+ maximo(4.9,70.1, 7.6));
        System.out.println("El mmaximo es: "+ maximo("manzana","zanahoria", "árandano"));

    }

    public static <T>List<T> fromArrayToList(T[] c){
            return Arrays.asList(c);
    }

    public static <T extends  Number>List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T,G>List<T> fromArrayToList(T[] c, G[] x){
        for (G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public  static  <T extends Comparable<T>> T maximo(T a, T b, T c ){
        T max = a;
        if(b.compareTo(max)>0){
            max= b;

        }
        if (c.compareTo(max)>0){
            max = c;
        }
        return max;
    }

}
