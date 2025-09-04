import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroDecimal = 0;
        System.out.println("Ingrese un número entero");
        //String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero");


        try {
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
        } catch (InputMismatchException e) {
            //JOptionPane.showMessageDialog(null,"Error debe ingresar un número entero");
            System.out.println("Error debe ingresar un número entero!");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "Número hexadecimal de " + numeroDecimal +" = " + Integer.toHexString(numeroDecimal);


        String mensaje = resultadoBinario + "\n" + resultadoOctal + "\n" + resultadoHex;
        System.out.println(mensaje);
        //JOptionPane.showMessageDialog(null, mensaje);

    }
}
