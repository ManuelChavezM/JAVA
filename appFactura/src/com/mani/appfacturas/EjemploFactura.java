package com.mani.appfacturas;

import com.mani.appfacturas.domain.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("555-5");
        cliente.setNombre("Mani");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc,cliente);


        Producto producto;
        //String nombre;
        //float precio;
        //int cantidad;

        System.out.println();
        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto n° " + producto.getCodigo()+ ": ");
           // nombre = s.nextLine();
           // producto.setNombre(nombre);
            producto.setNombre(s.nextLine());

            System.out.print("Ingrse el precio del producto ");
            //precio = s.nextFloat();
            //producto.setPrecio(precio);
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad del producto: ");
            //cantidad = s.nextInt();

            //ItemFactura item = new ItemFactura(cantidad,producto);
            ItemFactura item = new ItemFactura(s.nextInt(),producto);

            factura.addItemFactura(item);
            System.out.println();
            s.nextLine();

        }
        System.out.println(factura.generarDetalle());
    }
}
